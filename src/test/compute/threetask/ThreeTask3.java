package test.compute.threetask;

import java.util.concurrent.*;

/**
 * //TODO : Callable + FutureTask 获取结果
 * Created by qingcai.zqc on 2016/4/20.
 */
public class ThreeTask3 {

    Integer result = 0;
    public void test(){
        FutureTask<Integer> futureTask1 = new FutureTask<Integer>(new Callable1());
        FutureTask<Integer> futureTask2 = new FutureTask<Integer>(new Callable2());
        FutureTask<Integer> futureTask3 = new FutureTask<Integer>(new Callable3());

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(futureTask1);
        executorService.submit(futureTask2);
        executorService.submit(futureTask3);
        executorService.shutdown();

        try {
            result = futureTask1.get() + futureTask2.get() + futureTask3.get();//TODO:get()为阻塞方法，直到拿到结果。
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Callable + FutureTask 获取结果, result=" + result);

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
