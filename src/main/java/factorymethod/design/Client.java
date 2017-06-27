package factorymethod.design;

/**
 * Created by xianbin on 2017/6/13.
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportTxtOprerate();
        operate.concreteExportOperate("操作");
    }
}
