package test.classinitflow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qingcai.zqc on 2016/5/25.
 */
public class Outclass2Test {

    private Outclass2 mOutclass;

    @Before
    public void setUp() throws Exception {
        mOutclass = new Outclass2("input name");
    }

    @Test
    public void methodone() throws Exception {
        mOutclass.methodone();
    }

    @Test
    public void printNameList() throws Exception {
        mOutclass.printNameList();
    }
}