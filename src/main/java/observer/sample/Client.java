package observer.sample;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Client {
    public static void main(String[] args) {
        NewsPaper paper = new NewsPaper();
        paper.attach(new Reader("读者1"));
        paper.attach(new Reader("读者2"));
        paper.setContent("内容变成1");
    }
}
