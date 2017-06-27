package observer.design;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Subject {
    private List<Observer> observers = Lists.newArrayList();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }
}
