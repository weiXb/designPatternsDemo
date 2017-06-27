package facade.design;

/**
 * Created by xianbin on 2017/6/8.
 */
public class Facade {
    public void test(){
        new AmoduleImpl().testA();
        new BmoduleImpl().testB();
        new CmoduleImpl().testC();
    }
}
