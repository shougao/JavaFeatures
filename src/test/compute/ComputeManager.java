package test.compute;

import test.compute.threetask.ThreeTask1;
import test.compute.threetask.ThreeTask2;
import test.compute.threetask.ThreeTask3;

/**
 * Created by qingcai.zqc on 2016/4/20.
 */
public class ComputeManager {

    public void startTest(){
        (new ThreeTask1()).computeAlltask();
        (new ThreeTask2()).test();
        (new ThreeTask3()).test();
    }
}
