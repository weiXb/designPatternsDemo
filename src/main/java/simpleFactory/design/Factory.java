package simpleFactory.design;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xianbin on 2017/6/7.
 */
public class Factory {
    private Factory() {
    }

    public static Api getApi(int condition) {
        if (condition == 1) return new ApiImplA();
        if (condition == 2) return new ApiImplB();
        return null;
    }

    public static Api createApiByProperties() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in =Factory.class.getClassLoader().getResourceAsStream("FactoryTest.properties");
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            String str = p.getProperty("ImplClass");
            api = (Api) Class.forName(str).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return api;
    }
}
