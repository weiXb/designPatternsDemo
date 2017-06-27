package builder.design;

/**
 * Created by xianbin on 2017/6/15.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart();
    }
}
