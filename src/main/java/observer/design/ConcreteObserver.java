package observer.design;

/**
 * Created by xianbin on 2017/6/22.
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }


}
