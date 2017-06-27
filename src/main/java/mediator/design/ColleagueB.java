package mediator.design;

/**
 * Created by xianbin on 2017/6/20.
 */
public class ColleagueB extends Colleague {
    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void someOperation(){
        getMediator().change(this);
    }
}
