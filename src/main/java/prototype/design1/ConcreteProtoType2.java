package prototype.design1;

/**
 * Created by xianbin on 2017/6/20.
 */
public class ConcreteProtoType2 implements ProtoType {
    @Override
    public ProtoType clone() {
        ProtoType protoType = new ConcreteProtoType2();
        return protoType;
    }
}
