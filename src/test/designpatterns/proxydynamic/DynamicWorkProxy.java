package test.designpatterns.proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by qingcai.zqc on 2016/4/20.
 */
public class DynamicWorkProxy implements InvocationHandler {

    private Object target;//Iwork的实现类，实际工作的类

    //创建代理类实例
    public Object newInstance(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target, args);
        return null;
    }
}
