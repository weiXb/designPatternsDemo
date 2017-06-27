package proxy.design.动态代理;

import com.alibaba.fastjson.JSONObject;
import proxy.design.静态代理.Order;
import proxy.design.静态代理.OrderApi;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        OrderApi orderApi =proxy.getProxyInstance(new Order("产品",10,"小弱智"));

        orderApi.setProductName("changp","daruozhi");
        System.out.println(JSONObject.toJSONString(orderApi));
        orderApi.setProductName("changp","小弱智");
        System.out.println(JSONObject.toJSONString(orderApi));

    }
}
