package prototype.sample2;

import org.apache.commons.lang3.ArrayUtils;

import java.io.*;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by xianbin on 2017/6/20.
 */
public class CloneUtil {
    private CloneUtil() {
    }

    public static <T extends Serializable> T clone(T obj) {
        T objclone = null;

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            objclone = (T) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objclone;
    }

    public static void main(String[] args) {
        String[] arr = {"张三(z)", "李四(l)", "王五(w)"};
//        Arrays.sort(arr, Comparator.comparing(a -> a.length(), Comparator.reverseOrder()));
        Arrays.sort(arr, Collator.getInstance(Locale.CANADA));
        System.out.println(ArrayUtils.toString(arr));
    }
}
