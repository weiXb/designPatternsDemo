package adapter.nodesign;

import java.util.List;

/**
 * Created by xianbin on 2017/6/11.
 */
public interface LogFileOperateApi {

    List<LogModel> readLogFile();

    void writeLogFile(List<LogModel> logModels);
}
