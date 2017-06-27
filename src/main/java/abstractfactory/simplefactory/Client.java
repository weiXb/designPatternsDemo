package abstractfactory.simplefactory;

/**
 * Created by xianbin on 2017/6/14.
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer(1, 2);
        computer.calculate();
    }
}
