package mediator.design;

/**
 * Created by xianbin on 2017/6/20.
 */
public class ConcreteMediatorA implements Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void change(Colleague colleague) {

    }
}
