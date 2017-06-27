package mediator.design;

/**
 * Created by xianbin on 2017/6/20.
 */
public class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void someOperation(){
        getMediator().change(this);
    }
}
