package proxy.design.动态代理;

import org.apache.commons.lang.StringUtils;
import proxy.design.静态代理.Order;
import proxy.design.静态代理.OrderApi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Proxy implements InvocationHandler {
    private OrderApi order;

    public OrderApi getProxyInstance(Order order) {
        this.order = order;
        OrderApi orderApi = (OrderApi) java.lang.reflect.Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
        return orderApi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set")) {
            if (StringUtils.equals(args[1].toString(), this.order.getOrderUser())) {
                return method.invoke(order, args);
            }
            System.out.println(args[1] + "无权操作");
        } else {
            return method.invoke(order, args);
        }
        return null;
    }
}
