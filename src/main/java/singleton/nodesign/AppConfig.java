package singleton.nodesign;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xianbin on 2017/6/12.
 */
public class AppConfig {
    private String parameterA;
    private String parameterB;

    public AppConfig() {
        readConfig();
    }

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;

        try {
            in = AppConfig.class.getClassLoader().getResourceAsStream("Appconfig.properties");
            p.load(in);

            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
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
