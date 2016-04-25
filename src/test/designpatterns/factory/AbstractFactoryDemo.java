package test.designpatterns.factory;

/**
 * 抽象工厂， 生产工厂的工厂。灯， 被工厂生产， 工厂被抽象工厂生产， 容易扩展分工厂。
 *
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
 * 所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，
 * 直接增加新的工厂类就可以了，不需要修改之前的代码。因为抽象工厂不太好理解，我们先看看图，然后就和代码，就比较容易理解。
 *
 * Created by qingcai.zqc on 2016/4/22.
 */
public class AbstractFactoryDemo {

    public interface IAbstractFactory{
        public ILight produce();
        public INewLight produceNew();
    }

    /**
     * 工厂， 生产产品用。
     */
    public interface IFactory{
        public ILight produce();
    }

    /**
     * 新增工厂， 生产产品用。
     */
    public interface INewFactory{
        public INewLight produce();
    }

    /**
     * 抽象产品
     */
    public interface ILight{
        public void turnOn();
        public void turnOff();
    }

    /**
     * 新增产品
     */
    public interface INewLight{
        public void turnOn();
        public void turnOff();
    }

    /**
     * 具体产品
     */
    public class ALight implements ILight {
        @Override
        public void turnOff() {
            System.out.println("ALight off");
        }

        @Override
        public void turnOn() {
            System.out.println("ALight on");
        }
    }

    public class BLight implements ILight {
        @Override
        public void turnOff() {
            System.out.println("BLight off");
        }

        @Override
        public void turnOn() {
            System.out.println("BLight on");
        }
    }

    /**
     * 具体新产品
     */
    public class ANewLight implements INewLight {
        @Override
        public void turnOff() {
            System.out.println("ANewLight off");
        }

        @Override
        public void turnOn() {
            System.out.println("ANewLight on");
        }
    }

    public class BNewLight implements INewLight {
        @Override
        public void turnOff() {
            System.out.println("BNewLight off");
        }

        @Override
        public void turnOn() {
            System.out.println("BNewLight on");
        }
    }

    public class FactoryImpl implements IFactory{
        @Override
        public ILight produce() {
            return new ALight();//TODO:或者返回BLight
        }
    }

    public class NewFactoryImpl implements INewFactory{
        @Override
        public INewLight produce() {
            return new ANewLight();//TODO:或者返回BNewLight
        }
    }

    public class AbstractFactoryImpl implements IAbstractFactory{

        @Override
        public ILight produce() {
            return null;
        }

        @Override
        public INewLight produceNew() {
            return null;
        }
    }

    public void test(){
        System.out.println("\n");
        NewFactoryImpl newFactory = new NewFactoryImpl();
        INewLight newLight = newFactory.produce();
        newLight.turnOn();
        newLight.turnOff();
    }








}
