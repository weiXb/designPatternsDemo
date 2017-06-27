package proxy.design.静态代理;

import org.apache.commons.lang.StringUtils;

/**
 * Created by xianbin on 2017/6/22.
 */
public class OrderProxy implements OrderApi {
    private Order order;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String userId) {
        if (StringUtils.equals(userId, this.getOrderUser())) {
            this.order.setProductName(productName, userId);
        } else {
            System.out.println(userId + "无权操作");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String userId) {
        if (StringUtils.equals(userId, this.getOrderUser())) {
            this.order.setOrderNum(orderNum, userId);
        } else {
            System.out.println(userId + "无权操作");
        }
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String userId) {
        if (StringUtils.equals(userId, this.getOrderUser())) {
            this.order.setOrderUser(orderUser, userId);
        } else {
            System.out.println(userId + "无权操作");
        }
    }
}
