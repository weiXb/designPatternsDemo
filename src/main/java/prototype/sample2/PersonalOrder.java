package prototype.sample2;

/**
 * Created by xianbin on 2017/6/20.
 */
public class PersonalOrder implements OrderApi ,Cloneable{
    private String customerName;
    private Product product;
    private int orderNum;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 浅克隆
     * @return
     */
    @Override
    public OrderApi cloneOrder() {

        try {
            return (OrderApi) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
