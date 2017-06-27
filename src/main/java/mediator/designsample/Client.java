package mediator.designsample;

import org.n3r.idworker.Id;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Client {
    public static void main(String[] args) {
        Mainboarder mainboarder = new Mainboarder();
        CDdriver cDdriver = new CDdriver(mainboarder);
        mainboarder.setcDdriver(cDdriver);

        mainboarder.setCpu(new CPU(mainboarder));
        mainboarder.setSoundCard(new SoundCard(mainboarder));
        mainboarder.setVideoCard(new VideoCard(mainboarder));

        cDdriver.readCD();
    }
}
