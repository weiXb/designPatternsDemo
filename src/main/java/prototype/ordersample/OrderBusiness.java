package prototype.ordersample;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by xianbin on 2017/6/20.
 */
public class OrderBusiness {
    public void saveOrder(OrderApi orderApi) {
        while (true) {
            if (!(orderApi.getOrderNum() > 1000)) break;
            OrderApi newOrder = orderApi.cloneOrder();
            newOrder.setOrderNum(1000);
            orderApi.setOrderNum(orderApi.getOrderNum() - 1000);
            System.out.println("拆分的订单：" + JSONObject.toJSONString(newOrder));
        }
        System.out.println("原来的订单：" + JSONObject.toJSONString(orderApi));
    }
}
