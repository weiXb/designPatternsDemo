package adapter.nodesign;

import java.io.*;
import java.util.List;

/**
 * Created by xianbin on 2017/6/11.
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePath = "../designPatternsDemo/AdaptorLog.log";

    public LogFileOperate(String logFilePath) {
        if (logFilePath != null && logFilePath != "") this.logFilePath = logFilePath;
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;

        try {
            File f = new File(logFilePath);
            if (f.exists()) {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>) oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(oin != null) oin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> logModels) {
        File f= new File(logFilePath);
        ObjectOutputStream oout = null;

        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oout.writeObject(logModels);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
