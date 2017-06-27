package prototype.sample2;

import java.io.Serializable;

/**
 * Created by xianbin on 2017/6/20.
 */
public class EnterpriseOrder implements OrderApi, Cloneable, Serializable {
    private String enterpriseName;
    private Product product;
    private int orderNum;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
     *
     * @return
     */
    @Override
    public OrderApi cloneOrder() {
        return CloneUtil.clone(this);
        /*try {
            return (OrderApi) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;*/
    }
}
