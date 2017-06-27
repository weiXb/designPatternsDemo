package facade.nodesign;

/**
 * Created by xianbin on 2017/6/8.
 */
public class ConfigManager {


    private ConfigManager() {
    }

    static class SingleManager {
        private static ConfigManager configManager = new ConfigManager();
        private static ConfigModel configModel = new ConfigModel();

        static {
            configModel.setNeedGenBusiness(false);
            //省略model设置...
        }
    }

    public static ConfigManager getInstance() {
        return SingleManager.configManager;
    }

    public ConfigModel getConfigData() {
        return SingleManager.configModel;
    }

}
