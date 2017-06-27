package singleton.nodesign;

/**
 * Created by xianbin on 2017/6/12.
 */
public class Client {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        String paramA = appConfig.getParameterA();
        String paramB = appConfig.getParameterB();
        System.out.println(paramA + "====" + paramB);
    }
}
