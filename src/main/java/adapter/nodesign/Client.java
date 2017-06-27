package adapter.nodesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianbin on 2017/6/11.
 */
public class Client {

    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2017-6-11");
        logModel.setLogContent("这是测试");


        List<LogModel> list = new ArrayList<>();
        list.add(logModel);

        LogFileOperateApi api = new LogFileOperate("");
        api.writeLogFile(list);


        List<LogModel> readLog = api.readLogFile();
        System.out.println(readLog);

    }
}
