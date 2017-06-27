package mediator.designsample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("正在观看：" + data);
        this.getMediator().change(this);
    }
}
