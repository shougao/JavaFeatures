package test.classinitflow;

/**
 * 类的初始化顺序是:
 * 1. 静态fiedl， 静态块， >
 * 2. field, 代码块
 * 3. 构造函数
 * Created by qingcai.zqc on 2016/5/25.
 */
public class Outclass {

    private String name = null;


    String namelist[] = {
            "zhangsan",
            "lisi",
            name   //TODO：导致问题处，这个name已经被先初始化，后面对name赋值，对这个那么没有影响。
    };


    public Outclass(String newName) {
        name = newName;
    }

    public void methodone() {
        if (name == null) {
            System.out.println("name == null");
        } else {
            System.out.println("name = " + name);
        }
    }

    public void printNameList() {
        System.out.println("printNameList");
        for (int i = 0; i < namelist.length; i++) {
            if (namelist[i] == null) {
                System.out.println("name == null");
            } else {
                System.out.println("name = " + namelist[i]);
            }
        }
    }

}
