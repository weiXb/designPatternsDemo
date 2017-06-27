package mediator.designsample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData;
    private String soundData;

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        this.soundData = data + " 声音";
        this.videoData = data + " 视频";

        this.getMediator().change(this);
    }
}
