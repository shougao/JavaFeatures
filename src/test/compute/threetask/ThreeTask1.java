package test.compute.threetask;

/**
 * 需求：task1, task2, task3, 3个耗时操作，在计算完成后，把三个结果合并。
 * 第一种实现，多个线程join方式。实际并不能并发
 * Created by qingcai.zqc on 2016/4/20.
 */
public class ThreeTask1 {
    private static int result = 0;

    class Thread1 extends Thread{
        @Override
        public void run() {
            result = result + 1;
            System.out.println("result=" + result);
        }
    }

    class Thread2 extends Thread{
        @Override
        public void run() {
            result = result + 2;
            System.out.println("result=" + result);
        }
    }

    class Thread3 extends Thread{
        @Override
        public void run() {
            result = result + 4;
            System.out.println("result=" + result);
        }
    }

    public void computeAlltask(){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All result=" + result);
    }
}
