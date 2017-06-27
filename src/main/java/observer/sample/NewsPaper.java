package observer.sample;

/**
 * Created by xianbin on 2017/6/22.
 */
public class NewsPaper extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
