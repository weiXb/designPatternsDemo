package facade.nodesign;

/**
 * Created by xianbin on 2017/6/8.
 */
public class Business {

    public void generation() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();

        if (configModel.isNeedGenBusiness()) {
            //按要求生成代码
            System.out.println("正在生成逻辑层代码");
        }
    }
}
