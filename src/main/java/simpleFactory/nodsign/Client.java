package simpleFactory.nodsign;

/**
 * Created by xianbin on 2017/6/7.
 */
public class Client {
    public static void main(String[] args) {
        Api api = new ApiImpl();
        api.test1("测试");
    }
}
