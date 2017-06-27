package factorymethod.design;

import factorymethod.nodesign.ExportFileApi;

/**
 * Created by xianbin on 2017/6/13.
 */
public class ExportDB implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出" + data + "到数据库");
        return true;
    }
}
