package observer.jdkSample;

import java.util.Observable;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Newspaper extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers();
    }
}
