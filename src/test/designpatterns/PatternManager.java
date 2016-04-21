package test.designpatterns;

import test.designpatterns.proxydynamic.DynamicWorkerTest;
import test.designpatterns.proxystatic.StaticWorkerTest;

/**
 * 所有设计模式包的测试入口类。
 * Created by qingcai.zqc on 2016/4/20.
 */
public class PatternManager {

    public void startTest() {
        proxystaticTest();//静态代理
    }

    private void proxystaticTest(){

        StaticWorkerTest mWorkerTest = new StaticWorkerTest();
        mWorkerTest.test();

        DynamicWorkerTest dynamicWorkerTest = new DynamicWorkerTest();
        dynamicWorkerTest.test();
    }


}
