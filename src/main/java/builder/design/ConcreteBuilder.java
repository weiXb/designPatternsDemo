package builder.design;

/**
 * Created by xianbin on 2017/6/15.
 */
public class ConcreteBuilder implements Builder {
    private Product resultProduct;

    public Product getResult() {
        return resultProduct;
    }

    @Override
    public void buildPart() {

    }
}
