package test.threadlocal;

/**
 * ThreadLocal的应用场合，我觉得最适合的是按线程多实例（每个线程对应一个实例）的对象的访问，
 * 并且这个对象很多地方都要用到。
 * 两个ThreadLocal里存的Value ： string和long， 是用于每个线程的值。在工程中，对位自定义的类。
 * 引用： http://www.cnblogs.com/dolphin0520/p/3920407.html
 *
 * Created by qingcai.zqc on 2016/4/19.
 */
public class ThreadLocalTest {

    /**
     * 线程的名字。
     * 泛型String 是存入的， 用来在每个线程保存的。
     */
    public ThreadLocal<String> mStringThreadLocal = new ThreadLocal<String>();

    /**
     * 线程的ID
     */
    public ThreadLocal<Long> mLongThreadLocal = new ThreadLocal<Long>(){
        //使用了初始值默认的id。
        @Override
        protected Long initialValue() {
            return Thread.currentThread().getId();
        }
    };

    public void set(){
        mStringThreadLocal.set(Thread.currentThread().getName());
        mLongThreadLocal.set(Thread.currentThread().getId());
    }

    public long getThreadLocalLong(){
        System.out.println("value <Long> = " + mLongThreadLocal.get());
        return mLongThreadLocal.get();
    }

    public String getThreadLocalString(){
        System.out.println("value <String> = " + mStringThreadLocal.get());
        return mStringThreadLocal.get();
    }
}

/*
应用场景举例 1：
private static ThreadLocal<Connection> connectionHolder
= new ThreadLocal<Connection>() {
public Connection initialValue() {
    return DriverManager.getConnection(DB_URL);
}
};

public static Connection getConnection() {
return connectionHolder.get();
}

应用场景举例 2：
private static final ThreadLocal threadSession = new ThreadLocal();

    public static Session getSession() throws InfrastructureException {
        Session s = (Session) threadSession.get();          //没有定义存储类型的泛型，则需要强转为Session
        try {
            if (s == null) {
                s = getSessionFactory().openSession();
                threadSession.set(s);
            }
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return s;
    }
*/