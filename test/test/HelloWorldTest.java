package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qingcai.zqc on 2016/4/25.
 */
public class HelloWorldTest {

    private HelloWorld mHelloworld;
    @Before
    public void setUp() throws Exception {
        mHelloworld = new HelloWorld();
    }

    @Test
    public void hello() throws Exception {
        mHelloworld.hello();
    }

}