package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xianbin on 2017/6/22.
 */
public class RegExp {
    public static void main(String[] args) {
        String str = "2093m18yi19";
        Pattern pattern = Pattern.compile("\\D+");
        StringBuffer sb = new StringBuffer();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            matcher.appendReplacement(sb, "");
            System.out.println(matcher.group());
            System.out.println(sb);
        }
        matcher.appendTail(sb);
        System.out.println(sb);
    }
}
