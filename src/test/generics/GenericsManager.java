package test.generics;

/**
 * 泛型：定义了一类 类， 当不知道未来需要处理的类，是什么类型时， 就定义一类 类的类型。
 * Created by qingcai.zqc on 2016/4/20.
 */
public class GenericsManager {

    /**
     * 什么类型都能装的一个盒子。
     * @param <T>
     */
    public class Box<T>{

        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get(){
            return t;
        }
    }

    public void test(){
        Box<String> stringBox = new Box<String>();
        stringBox.set("abc");
        System.out.println("stringBox has " + stringBox.get());

        Box<Persion> persionBox = new Box<Persion>();
        persionBox.set(new Persion());
        System.out.println("persionBox has persion, age=" + persionBox.get().age + ", name=" + persionBox.get().name);
    }

    public class Persion{
        public int age;
        public String name;

        public Persion(){
            age = 12;
            name = "zhangsan.";
        }
    }
}
