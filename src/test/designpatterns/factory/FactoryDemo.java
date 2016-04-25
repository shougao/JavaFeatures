package test.designpatterns.factory;

/**
 * 这是一个生产灯泡的工厂, 使用接口的方式实现调用。
 *
 * 抽象工厂（Creator)角色：工厂方法模式的核心，任何在模式中创建的对象的工厂必须实现这个接口。
 * 具体工厂（Concrete Creator)角色：实现抽象工厂接口的具体工厂类，包含应用程序的逻辑。
 * 抽象产品（Product)角色：产品对象的共同父类或共同拥有的接口。
 * 具体产品（Concrete Product)角色：实现了抽象产品角色定义的接口，其具体产品有专门的具体工厂创建。
 *
 * 使用场景：
 * 对于某个产品，调用者清楚知道应该使用哪个具体工厂服务，实例化该具体工厂，生产出具体的产品来；
 * 只是需要一种产品，对于那个工厂生产的并不关心，最终选用哪个具体工厂由生产者一方决定，它根据当前系统的情况来实例化一个具体的工厂返回给使用者，这个决策过程对于使用者来说是透明的。
 *
 *
 * Created by qingcai.zqc on 2016/4/22.
 */
public class FactoryDemo {

    /**
     * 工厂， 生产产品用。
     */
    public interface IFactory{
        public ILight produce();
    }

    /**
     * 抽象产品
     */
    public interface ILight{
        public void turnOn();
        public void turnOff();
    }

    /**
     * 具体产品
     */
    public class ALight implements ILight{
        @Override
        public void turnOff() {
            System.out.println("ALight off");
        }

        @Override
        public void turnOn() {
            System.out.println("ALight on");
        }
    }

    public class BLight implements ILight{
        @Override
        public void turnOff() {
            System.out.println("BLight off");
        }

        @Override
        public void turnOn() {
            System.out.println("BLight on");
        }
    }

    public class XFactory implements IFactory{
        @Override
        public ILight produce() {
            return new ALight();
        }
    }

    public class YFactory implements IFactory{
        @Override
        public ILight produce() {
            return new BLight();
        }
    }

    public void test(){
        System.out.println("\n");
        ILight light1 = new XFactory().produce();
        ILight light2 = new YFactory().produce();
        light1.turnOn();
        light1.turnOff();
    }

}
