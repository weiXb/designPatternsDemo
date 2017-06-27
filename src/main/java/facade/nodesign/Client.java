package facade.nodesign;

/**
 * Created by xianbin on 2017/6/8.
 */
public class Client {

    public static void main(String[] args) {
        new Presentation().generation();
        new Business().generation();
        new Dao().generation();

        //使用facade
        new IfUseFacade().generator();
    }
}
