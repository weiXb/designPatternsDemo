package factorymethod.design;

/**
 * Created by xianbin on 2017/6/13.
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product productFactory() {
        return new ConcreteProduct();
    }
}
