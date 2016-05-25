package test.classinitflow;

/**
 * Created by qingcai.zqc on 2016/5/25.
 */
public class Outclass2 {

    private String name = null;


    String namelist[];


    public Outclass2(String newName) {
        name = newName;

        namelist = new String[]{
                "zhangsan",
                "lisi",
                newName
        };
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
