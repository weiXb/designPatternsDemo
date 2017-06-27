package singleton.design;

/**
 * Created by xianbin on 2017/6/12.
 */
public class Singleton {
    private Singleton() {
    }

    //懒
    /*private static Singleton singleton = null;

    public static synchronized Singleton getInstance() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }

    public static Singleton getInstance2() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }*/


    //饿
    private static Singleton singleton = new Singleton();

    public static Singleton getInsance() {
        return singleton;
    }

    public void operate() {
        //可以有自己的操作
    }

    public static class inner{

    }

    public class inner2{

    }
}
