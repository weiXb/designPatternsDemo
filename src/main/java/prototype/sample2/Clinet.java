package prototype.sample2;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Clinet {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId("120");
        EnterpriseOrder enterpriseOrder =new EnterpriseOrder();
        enterpriseOrder.setEnterpriseName("企业订单");
        enterpriseOrder.setProduct(product);
        enterpriseOrder.setOrderNum(1200);

        new OrderBusiness().saveOrder(enterpriseOrder);
    }
}
