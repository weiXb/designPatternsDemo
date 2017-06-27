package abstractfactory.simplefactory;

/**
 * Created by xianbin on 2017/6/14.
 */
public class SimpleFactory {
    private SimpleFactory() {
    }

    public static CPUApi createCPU(int type){
        if(type == 1) return new InterCPU(9);
        if(type == 2) return new AMDCPU(10);
        return null;
    }

    public static MainBoardApi createMainBoard(int type){
        if(type == 1) return new GAMainBorad(9);
        if(type == 2) return new MSMainBorad(10);
        return null;
    }
}
