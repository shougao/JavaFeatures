package test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by qingcai.zqc on 2016/4/25.
 */
public class JUnitHelloWorldTest {

    private JUnitHelloWorld mHelloworld;

    @Before
    public void setUp() throws Exception {
        mHelloworld = new JUnitHelloWorld();
    }

    @Test
    public void hello() throws Exception {
        mHelloworld.hello("eric");
    }

}