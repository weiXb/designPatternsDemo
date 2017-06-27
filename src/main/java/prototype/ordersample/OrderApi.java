package prototype.ordersample;

/**
 * Created by xianbin on 2017/6/20.
 */
public interface OrderApi {
    int getOrderNum();

    void setOrderNum(int orderNum);

    OrderApi cloneOrder();
}
