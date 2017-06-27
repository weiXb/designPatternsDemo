package abstractfactory.simplefactory;

/**
 * Created by xianbin on 2017/6/14.
 */
public class GAMainBorad implements MainBoardApi {
    private int  cpuholes= 0;

    public GAMainBorad(int cpuholes) {
        this.cpuholes = cpuholes;
    }

    @Override
    public void installCPU() {
        System.out.println("this is GA ,cpuholes = " + cpuholes);
    }
}
