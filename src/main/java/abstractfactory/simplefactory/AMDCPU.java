package abstractfactory.simplefactory;

/**
 * Created by xianbin on 2017/6/14.
 */
public class AMDCPU implements CPUApi {
    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now is AMD cpu ,pins =" +pins);
    }
}
