package prototype.ordersample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class PersonalOrder implements OrderApi {
    private String customerName;
    private String productId;
    private int orderNum;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public OrderApi cloneOrder() {
        PersonalOrder orderApi = new PersonalOrder();
        orderApi.setCustomerName(this.customerName);
        orderApi.setProductId(this.productId);
        orderApi.setOrderNum(this.orderNum);
        return orderApi;
    }
}
