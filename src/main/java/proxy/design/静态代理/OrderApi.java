package proxy.design.静态代理;

/**
 * Created by xianbin on 2017/6/22.
 */
public interface OrderApi {
    String getProductName();

    void setProductName(String productName, String userId);

    int getOrderNum();

    void setOrderNum(int orderNum, String userId);

    String getOrderUser();

    void setOrderUser(String orderUser, String userId);

}
