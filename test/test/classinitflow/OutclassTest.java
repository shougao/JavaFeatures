package test.classinitflow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qingcai.zqc on 2016/5/25.
 */
public class OutclassTest {


    private Outclass mOutclass;
    @Before
    public void setUp() throws Exception {
        mOutclass = new Outclass("input name");
    }


    @Test
    public void methodone() throws Exception{
        mOutclass.methodone();
    }

    @Test
    public void printNameList() throws Exception {
        mOutclass.printNameList();
    }
}