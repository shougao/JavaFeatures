package test.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 存放产品的篮子，用于生产消费，篮子里的BlockingQueue保证了生产消费的同步。
 * Created by qingcai.zqc on 2016/4/20.
 */
public class Basket {
    BlockingQueue<String> basket = new ArrayBlockingQueue<String>(4);
    public void produce(){
        basket.add("apple");//生产一个苹果
    }

    public void consume() throws InterruptedException{
        basket.take();//消费一个苹果
    }
}
