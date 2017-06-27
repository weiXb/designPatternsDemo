package singleton.design;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xianbin on 2017/6/12.
 */
public class AppConfig {
    private static AppConfig appConfig = new AppConfig();

    private AppConfig() {
        readConfig();
    }

    public static AppConfig getInstace (){
        return appConfig;
    }


    private String parameterA;
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    private void readConfig(){
        Properties p = new Properties();
        InputStream in = AppConfig.class.getClassLoader()
                .getResourceAsStream("Appconfig.properties");
        try {
            p.load(in);
            parameterA = p.getProperty("paramA");
            parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
