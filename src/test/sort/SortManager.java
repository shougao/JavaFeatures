package test.sort;

import test.sort.bubblesort.BubbleSort;
import test.sort.quicksort.QuickSort;

/**
 * Created by qingcai.zqc on 2016/4/21.
 */
public class SortManager {


    public void sortTest(){
        QuickSort quickSort = new QuickSort();
        quickSort.test();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.test();
    }
}
