package proxy.design.静态代理;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Order implements OrderApi {
    private String productName;
    private int orderNum;
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName, String userId) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum, String userId) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser, String userId) {
        this.orderUser = orderUser;
    }
}
