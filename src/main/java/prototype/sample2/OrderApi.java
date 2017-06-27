package prototype.sample2;

/**
 * Created by xianbin on 2017/6/20.
 */
public interface OrderApi {
    int getOrderNum();

    void setOrderNum(int orderNum);

    Product getProduct();

    OrderApi cloneOrder();
}
