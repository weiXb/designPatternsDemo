package prototype.design1;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Client {
    private ProtoType protoType;

    public Client(ProtoType protoType) {
        this.protoType = protoType;
    }

    public void operation() {
        ProtoType newprotoType = protoType.clone();
    }

}
