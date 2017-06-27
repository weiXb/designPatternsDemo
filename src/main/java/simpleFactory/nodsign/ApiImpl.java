package simpleFactory.nodsign;

/**
 * Created by xianbin on 2017/6/7.
 */
public class ApiImpl implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Now is Impl. the input is ：" + s);
    }
}
