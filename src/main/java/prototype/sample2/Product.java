package prototype.sample2;

import java.io.Serializable;

/**
 * Created by xianbin on 2017/6/20.
 */
public class Product implements Cloneable, Serializable {
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
