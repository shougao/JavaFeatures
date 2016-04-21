package test.deadlock;

import java.util.Objects;

/**
 * 线程死锁，线程你想拿线程我正在持有的锁。 我想拿你正在持有的锁。产生互等导致。
 * Created by qingcai.zqc on 2016/4/20.
 */
public class DeadLock {

    public void testDeadLock(){
        System.out.println("Dead Lock test start.");
        Object o1 = new Object();
        Object o2 = new Object();
        (new DeadLockThreadA(o1, o2)).start();
        (new DeadLockThreadB(o1, o2)).start();
    }


    class DeadLockThreadA extends Thread{
        private Object obj1;
        private Object obj2;
        DeadLockThreadA(Object o1, Object o2){
            obj1 = o1;
            obj2 = o2;
        }

        @Override
        public void run() {
            synchronized (obj1){
                try {
                    Thread.sleep(100);
                    synchronized (obj2){
                        obj1.getClass();
                        System.out.println("threadA  running.");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class DeadLockThreadB extends Thread{
        private Object obj1;
        private Object obj2;
        DeadLockThreadB(Object o1, Object o2){
            obj1 = o1;
            obj2 = o2;
        }
        @Override
        public void run() {
            synchronized (obj2){
                try {
                    Thread.sleep(100);
                    synchronized (obj1){
                        obj2.getClass();
                        System.out.println("threadB  running.");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
