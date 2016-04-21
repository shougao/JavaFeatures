package test.hashmap;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by qingcai.zqc on 2016/4/20.
 * hashmap的遍历方法
 */
public class HashMapTest {

    HashMap<String , People> mHashMap = new HashMap<String, People>();

    public HashMapTest(){
        People p1 = new People("A", 12);
        People p2 = new People("B", 3);
        People p3 = new People();
        People p4 = new People("D", 89);

        mHashMap.put("p1", p1);
        mHashMap.put("p2", p2);
        mHashMap.put("p3", p3);
        mHashMap.put("p4", p4);


    }

    public void printHashMapKey(){
        Iterator<String> iterator = mHashMap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 遍历key，再得到entry
     * 效率低,以后尽量少使用！
     */
    public void printHashMap(){
        System.out.println("slow print.=======");
        Iterator<String> iterator = mHashMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + ", " + mHashMap.get(key).getName() + ", " + mHashMap.get(key).getAge());
        }
    }

    /**
     * 直接用entry遍历
     */
    public void printHashMapFast(){
        System.out.println("\nfast print.=======");
        Iterator iterator = mHashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + ", " + ((People)entry.getValue()).getAge()  + ", " + ((People) entry.getValue()).getName());
        }
    }
}
