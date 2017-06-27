package prototype.ordersample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderNum;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        EnterpriseOrder orderApi = new EnterpriseOrder();
        orderApi.setEnterpriseName(this.enterpriseName);
        orderApi.setProductId(this.productId);
        orderApi.setOrderNum(this.orderNum);
        return orderApi;
    }
}
