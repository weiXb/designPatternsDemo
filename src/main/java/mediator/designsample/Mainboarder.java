package mediator.designsample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Mainboarder implements Mediator {
    private CDdriver cDdriver;
    private CPU cpu;
    private SoundCard soundCard;
    private VideoCard videoCard;

    public void setcDdriver(CDdriver cDdriver) {
        this.cDdriver = cDdriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void change(Colleague colleague) {
        if (colleague == cDdriver) {
            cpu.executeData(cDdriver.getData());
        } else if (colleague == cpu) {
            soundCard.showData(cpu.getSoundData());
            videoCard.showData(cpu.getVideoData());
        }
    }
}
