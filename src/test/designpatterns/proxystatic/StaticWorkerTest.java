package test.designpatterns.proxystatic;

import test.designpatterns.proxycommon.WorkerImpl;

/**
 * 调用者通过代理类WorkerProxy，来调用真正的实现着mWorkerImpl，然后在代理执行的前后可以添加自定义的事件。
 * Created by qingcai.zqc on 2016/4/20.
 */
public class StaticWorkerTest {

    WorkerImpl mWorkerImpl = new WorkerImpl();
    WorkerProxy mWorkerProxy = new WorkerProxy();

    public void test(){
        System.out.println("\nstatic proxy;");
        mWorkerProxy.setImpl(mWorkerImpl);//TODO:把实现类的引用传给了代理类Proxy，proxy还是持有实现类的引用，动态代理会把proxy和实现类完全解耦。
        mWorkerProxy.work();
    }
}
