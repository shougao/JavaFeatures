package test.sort;

import test.sort.bubblesort.BubbleSort;
import test.sort.insertsort.InsertSort;
import test.sort.quicksort.QuickSort;

/**
 * 排序动画：
 * http://blog.csdn.net/killer1989/article/details/46548599
 * Created by qingcai.zqc on 2016/4/21.
 */
public class SortManager {


    public void sortTest(){
        QuickSort quickSort = new QuickSort();
        quickSort.test();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.test();

        InsertSort insertSort = new InsertSort();
        insertSort.test();
    }
}
