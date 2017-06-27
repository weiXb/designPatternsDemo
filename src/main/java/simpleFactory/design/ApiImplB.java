package simpleFactory.design;

/**
 * Created by xianbin on 2017/6/7.
 */
public class ApiImplB implements Api {
    @Override
    public void operate(String s) {
        System.out.println("this is Api Impl B. input is :" + s);
    }
}
