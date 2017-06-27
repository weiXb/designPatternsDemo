package facade.nodesign;

/**
 * Created by xianbin on 2017/6/8.
 */
public class Presentation {

    public void generation() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();

        if (configModel.isNeedGenPresentation()) {
            //按要求生成代码
            System.out.println("正在生成表现层代码");
        }
    }
}
