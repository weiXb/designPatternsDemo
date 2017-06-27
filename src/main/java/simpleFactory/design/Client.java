package simpleFactory.design;

/**
 * Created by xianbin on 2017/6/7.
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.getApi(1);
        api.operate("ceshi");

        api =Factory.createApiByProperties();
        api.operate("测试");

    }
}
