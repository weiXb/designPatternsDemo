package factorymethod.design;

import factorymethod.nodesign.ExportFileApi;

/**
 * Created by xianbin on 2017/6/13.
 */
public abstract class ExportOperate {
    protected abstract ExportFileApi exportFileApiFactory();

    public boolean concreteExportOperate(String data){
       return exportFileApiFactory().export(data);
    }
}
