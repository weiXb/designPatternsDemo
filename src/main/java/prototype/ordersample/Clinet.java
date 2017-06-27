package prototype.ordersample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Clinet {
    public static void main(String[] args) {
        EnterpriseOrder enterpriseOrder =new EnterpriseOrder();
        enterpriseOrder.setEnterpriseName("企业订单");
        enterpriseOrder.setProductId("111");
        enterpriseOrder.setOrderNum(2000);

        new OrderBusiness().saveOrder(enterpriseOrder);
    }
}
