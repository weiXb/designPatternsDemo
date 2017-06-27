package adapter.design;

/**
 * Created by xianbin on 2017/6/11.
 */
public class Adapter implements Target {
    Adapter adapter;

    public Adapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        //转调原有的功能进行适配
        adapter.request();
    }
}
