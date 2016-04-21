import test.BlockingQueue.TestBasket;
import test.compute.ComputeManager;
import test.deadlock.DeadLock;
import test.designpatterns.PatternManager;
import test.generics.GenericsManager;
import test.hashmap.HashMapTest;
import test.sort.SortManager;
import test.threadbasefunc.ThreadFuncTest;
import test.threadlocal.ThreadLocalTest;

/**
 * Java基础的学习
 * Created by qingcai.zqc on 2016/4/20.
 */
public class JavaFeatures {

    public void test1(){
//        System.out.println("hello");
    }

    public static void main(String[] args){
        JavaFeatures demo = new JavaFeatures();
        demo.test1();

        //hash map test
        HashMapTest hm = new HashMapTest();
//        hm.printHashMap();
//        hm.printHashMapFast();

        //BlockingQueue,生产者消费者并发测试
        TestBasket test = new TestBasket();
//        test.startTest();

        //死锁的测试
        DeadLock deadLock = new DeadLock();
//        deadLock.testDeadLock();

        //多次start一个线程
        ThreadFuncTest threadFuncTest = new ThreadFuncTest();
//        threadFuncTest.mutilStartThread();

        //ThreadLocal：每个线程持有的引用, Thread.join.
//        demo.testThreadLocal();

        //设计模式类测试
        PatternManager mPatternManager = new PatternManager();
        mPatternManager.startTest();

        //计算、算法类
        ComputeManager computeManager = new ComputeManager();
        computeManager.startTest();

        SortManager sortManager = new SortManager();
        sortManager.sortTest();

        //泛型， 任何类型都能处理， 处理时确定类型， 而不是在类内部之前定义好的类型。
        GenericsManager mGenericsManager = new GenericsManager();
        mGenericsManager.test();
    }

    private void testThreadLocal(){
        ThreadLocalTest mThreadLocalTest = new ThreadLocalTest();
        // 1.主线程验证泛型值。
        mThreadLocalTest.set(); //设置了当前线程的需要存的泛型类。
        mThreadLocalTest.getThreadLocalString();//获取主线程的Value， 也就是 StringThreadLocal<String>  中的泛型 String值。
        mThreadLocalTest.getThreadLocalLong(); //获取主线程的Value， 也就是 LongThreadLocal<Long>  中的泛型 Long值。

        // 2.自定义线程的验证
        Thread customThread = new Thread(){
            @Override
            public void run() {
                mThreadLocalTest.set();
                mThreadLocalTest.getThreadLocalString();
                mThreadLocalTest.getThreadLocalLong();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        try {
            customThread.start();
            customThread.join();//join运行在主线程里， 等待线程custom执行完。 起到，阻塞主线程继续往下执行。直到customThread.start()的run执行完，才往后执行主线程。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3.再次验证主线程的泛型值， 和上一次一致，说明每个线程都有自己的ThreadLocal。
        mThreadLocalTest.set();
        mThreadLocalTest.getThreadLocalString();
        mThreadLocalTest.getThreadLocalLong();
    }
}
