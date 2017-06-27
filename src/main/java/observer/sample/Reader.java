package observer.sample;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.name + "读取内容:" + ((NewsPaper) subject).getContent());
    }
}
