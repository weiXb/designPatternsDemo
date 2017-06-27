package abstractfactory.simplefactory;

/**
 * Created by xianbin on 2017/6/14.
 */
public class InterCPU implements CPUApi {
    private int pins = 0;

    public InterCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now is inter cpu ,pins =" +pins);
    }
}
