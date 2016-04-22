package test.designpatterns.singleinstance;

/**
 * Created by qingcai.zqc on 2016/4/22.
 */
public class SingleInstanceManager {

    public SingleInstanceManager(){

    }
    private static SingleInstanceManager instance = null;
    public static SingleInstanceManager getInstance(){
        if(instance == null) {
            synchronized (SingleInstanceManager.class) {
                if (instance == null) {
                    instance = new SingleInstanceManager();
                }
            }
        }
        return instance;
    }
}
