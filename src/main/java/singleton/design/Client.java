package singleton.design;

/**
 * Created by xianbin on 2017/6/12.
 */
public class Client {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstace();
        AppConfig appConfig2 = AppConfig.getInstace();
        String A = appConfig.getParameterA();
        String B = appConfig.getParameterB();

        System.out.println(A + "," + B);
        System.out.println(appConfig == appConfig2);
        int i = 1;
        int b = 1;
        System.out.println(i==b);

        System.out.println(SingletonEnum.singleton == SingletonEnum.singleton);
        System.out.println(SingletonEnum.singleton2== SingletonEnum.singleton);
        System.out.println(SingletonEnum.singleton2== SingletonEnum.singleton2);
    }
}
