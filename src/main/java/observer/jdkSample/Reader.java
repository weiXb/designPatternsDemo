package observer.jdkSample;

import observer.sample.NewsPaper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name+"读取："+((Newspaper)o).getContent());
    }
}
