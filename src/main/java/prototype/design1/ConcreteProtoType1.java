package prototype.design1;

/**
 * Created by xianbin on 2017/6/20.
 */
public class ConcreteProtoType1 implements ProtoType {
    @Override
    public ProtoType clone() {
        ProtoType protoType = new ConcreteProtoType1();
        return protoType;
    }
}
