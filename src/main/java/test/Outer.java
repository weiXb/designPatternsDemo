package test;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Outer {
    static {
        System.out.println("load outer class...");
    }

    //静态内部类
    static class StaticInner {
        static {
            System.out.println("load static inner class...");
        }

        static void staticInnerMethod() {
            System.out.println("static inner method...");
        }
    }

    private NormalInner normalInner;
    //内部类
   public class NormalInner {
        public NormalInner() {
            System.out.println("normal inner construct");
        }

        void staticInnerMethod() {
            System.out.println("normal inner method...");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();      //此刻其内部类是否也会被加载？
        System.out.println("===========分割线===========");
        Outer.StaticInner.staticInnerMethod();      //调用内部类的静态方法
       Outer.NormalInner normalInner = new Outer().new NormalInner();
    }
}
