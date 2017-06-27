package factorymethod.design;

import factorymethod.nodesign.ExportFileApi;

/**
 * Created by xianbin on 2017/6/13.
 */
public class ExportTxtOprerate extends ExportOperate {
    @Override
    protected ExportFileApi exportFileApiFactory() {
        return new ExportTxtFile();
    }
}
