package factorymethod.design;

import factorymethod.nodesign.ExportFileApi;

/**
 * Created by xianbin on 2017/6/13.
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出" + data + "到text文件");
        return true;
    }
}
