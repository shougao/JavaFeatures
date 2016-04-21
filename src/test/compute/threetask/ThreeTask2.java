package test.compute.threetask;

import java.util.concurrent.*;

/**
 * 使用Callable+Future获取执行结果
 * Created by qingcai.zqc on 2016/4/20.
 */
public class ThreeTask2 {
//TODO : Callable + Future 获取结果

    Integer result = 0;

    public void test(){

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future1 = executorService.submit(new Callable1());
        Future<Integer> future2 = executorService.submit(new Callable2());
        Future<Integer> future3 = executorService.submit(new Callable3());
        try {
            result = future1.get() + future2.get() + future3.get();//TODO:get()为阻塞方法，直到拿到结果。
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Callable + Future 获取结果, result=" + result);
    }

    class Callable1 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }

    class Callable2 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 2;
        }
    }

    class Callable3 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 4;
        }
    }

}
