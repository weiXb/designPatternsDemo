package factorymethod.design;

import factorymethod.nodesign.ExportFileApi;

/**
 * Created by xianbin on 2017/6/13.
 */
public class ExportDBOprerate extends ExportOperate {
    @Override
    protected ExportFileApi exportFileApiFactory() {
        return new ExportDB();
    }
}
