package abstractfactory.design;

/**
 * Created by xianbin on 2017/6/14.
 */
public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
