package observer.jdkSample;

/**
 * Created by xianbin on 2017/6/22.
 */
public class Client {
    public static void main(String[] args) {
        Newspaper paper = new Newspaper();
        paper.addObserver(new Reader("读者1"));
        paper.addObserver(new Reader("读者2"));
        paper.setContent("内容变成1");
    }
}
