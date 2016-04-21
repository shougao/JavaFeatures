package test.threadbasefunc;

/**
 * 多次start一个线程的测试。
 * Created by qingcai.zqc on 2016/4/20.
 */
public class ThreadFuncTest {


    public void mutilStartThread(){
        DeadLockThreadC threadC = new DeadLockThreadC();
        threadC.start();
        threadC.start();
    }


    class DeadLockThreadC extends Thread{
        @Override
        public void run() {
            try {
                Thread.State state = Thread.currentThread().getState();
                System.out.println("thread  running, state =" + state );
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
