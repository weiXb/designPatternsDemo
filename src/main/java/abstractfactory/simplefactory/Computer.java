package abstractfactory.simplefactory;

/**
 * Created by xianbin on 2017/6/14.
 */
public class Computer {
    private CPUApi cpuApi;
    private MainBoardApi mainBoardApi;

    public Computer(int cpuType, int mainboardType) {
        createComputer(cpuType, mainboardType);
    }

    private void createComputer(int cpuType, int mainboardType) {
        this.cpuApi = SimpleFactory.createCPU(cpuType);
        this.mainBoardApi = SimpleFactory.createMainBoard(mainboardType);
    }

    public void calculate(){
        cpuApi.calculate();
        mainBoardApi.installCPU();
    }
}
