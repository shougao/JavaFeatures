package test.designpatterns.proxystatic;

import test.designpatterns.proxycommon.IWorker;

/**
 * 这是代理类， 实现了， 在执行工作时，对其添加指定的行为， before work， after work。
 *
 * Created by qingcai.zqc on 2016/4/20.
 */
public class WorkerProxy implements IWorker {

    private IWorker iWorker;

    public void setImpl(IWorker iWorker){
        this.iWorker = iWorker;
    }

    @Override
    public void work() {
        System.out.println("Before work");
        iWorker.work();
        System.out.println("After work");
    }
}

//TODO: 如果想更换"Before work" 和 "After work" 就需要再写一个代理类。
//TODO: 如果是动态代理就不用，详见动态代理。
