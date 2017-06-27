package factorymethod.design;

/**
 * Created by xianbin on 2017/6/13.
 */
public abstract class Creator {
    /**
     * 创建product的工厂方法
     */
    protected abstract Product productFactory();

    public void someOperation(){
        Product product = productFactory();

        //调用具体的product实例来实现功能
    }
}
