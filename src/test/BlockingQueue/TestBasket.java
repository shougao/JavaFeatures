package test.BlockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * Created by qingcai.zqc on 2016/4/20.
 */
public class TestBasket {
    Basket mBasket = new Basket();


    public class productor implements Runnable{
        @Override
        public void run() {
            while(true) {
                System.out.println("生产苹果: " + System.currentTimeMillis());
                mBasket.produce();
                System.out.println("生产完毕: " + System.currentTimeMillis());
            }
        }
    }

    public class consumer implements Runnable{
        @Override
        public void run() {
            while(true) {
                try {
                    System.out.println("consumer apple begin: " + System.currentTimeMillis());
                    mBasket.consume();
                    System.out.println("consumer apple end: " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void startTest(){
        ExecutorService service = Executors.newFixedThreadPool(40);
        service.submit(new consumer());
        service.submit(new productor());

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
