package test.designpatterns.singleinstance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qingcai.zqc on 2016/4/22.
 */
public class SingleInstanceDemo {



    class Callable1 implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(10);
            System.out.println("instance address = " + SingleInstanceManager.getInstance());
            return null;
        }
    }

    public void test(){
        System.out.println("\n");
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for(int i=0; i<10; i++) {
            exec.submit(new Callable1());
        }
        System.out.println("\n");
    }


}
