package facade.nodesign;

/**
 * Created by xianbin on 2017/6/8.
 */
public class IfUseFacade {
    public void generator(){
        new Presentation().generation();
        new Business().generation();
        new Dao().generation();
    }
}
