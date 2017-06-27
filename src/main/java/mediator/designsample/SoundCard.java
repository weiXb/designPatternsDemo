package mediator.designsample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("正在收听：" + data);
        this.getMediator().change(this);
    }
}
