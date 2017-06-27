package proxy.design.静态代理;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Client {
    public static void main(String[] args) {
        OrderApi orderApi = new OrderProxy(new Order("产品",12,"小智障"));
        orderApi.setProductName("产品2","老智障");
        System.out.println(JSONObject.toJSONString(orderApi));
        orderApi.setProductName("产品2","小智障");
        System.out.println(JSONObject.toJSONString(orderApi));
    }
}
