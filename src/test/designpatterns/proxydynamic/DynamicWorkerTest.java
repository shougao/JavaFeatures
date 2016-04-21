package test.designpatterns.proxydynamic;

import test.designpatterns.proxycommon.IWorker;
import test.designpatterns.proxycommon.WorkerImpl;

/**
 * Created by qingcai.zqc on 2016/4/20.
 */
public class DynamicWorkerTest {

    IWorker worker;
    WorkerImpl mWorkImpl = new WorkerImpl();
    DynamicWorkProxy proxy = new DynamicWorkProxy();

    public void test() {
        worker = (IWorker)proxy.newInstance(mWorkImpl);//传入实现类， 返回实现类对应的代理类。
        worker.work();
    }
}
