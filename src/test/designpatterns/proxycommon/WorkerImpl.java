package test.designpatterns.proxycommon;

/**
 * Created by qingcai.zqc on 2016/4/20.
 */
public class WorkerImpl implements IWorker {
    @Override
    public void work() {
        System.out.println("workerimpl is work.");
    }
}
