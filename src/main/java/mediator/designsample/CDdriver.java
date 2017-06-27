package mediator.designsample;

/**
 * Created by xianbin on 2017/6/20.
 */
public class CDdriver extends Colleague {
    public CDdriver(Mediator mediator) {
        super(mediator);
    }

    private String data;

    public String getData() {
        return data;
    }

    public void readCD(){
        this.data = "cddriver 读取cd";
        this.getMediator().change(this);
    }

}
