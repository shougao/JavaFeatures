package test.sort.quicksort;

import java.io.Console;

/**
 * 快排
 * http://www.cnblogs.com/dolphin0520/archive/2011/07/10/2102529.html
 * 基本思想：1.排序sort，2.划分paration找到基准（pivot）
 * Created by qingcai.zqc on 2016/4/21.
 */
public class QuickSort {

    private static int[] unsort = {5, 1, 7, 11, 3, 9, 0};
    /**
     * 把划分的结果进行递归排序
     * @param unsort 未排序数组
     * @param low 低位索引
     * @param high 高位索引
     */
    private void sort(int[] unsort, int low, int high){
        if(low < high){
            int pivot = paration(unsort, low, high);
            sort(unsort, low, pivot-1);//划分的左侧右侧分别排序
            sort(unsort, pivot+1, high);
        }
    }

    /**
     * low为基准，先从high比较，再从low比较。
     * @param unsort
     * @param low
     * @param high
     * @return
     */
    private int paration(int[] unsort, int low, int high){
        int pivot = low;
        while(low < high){
            while(unsort[low] < unsort[high]) {
                high--;
            }
            swap(low, high);

            while(unsort[low] < unsort[high]){
                low++;
            }
            swap(low, high);
            if(low == high){
                break;
            }
        }
        return high;
    }

    private void swap(int left, int right){
        int temp = unsort[left];
        unsort[left] = unsort[right];
        unsort[right] = temp;
    }

    /**
     * 测试类。
     */

    public void test() {
        sort(unsort, 0, unsort.length-1);
        int i=0;
        System.out.println("\nquick sort:");
        for(int x: unsort){
            System.out.print(x + ",");
        }
        System.out.println("\n");
    }

}
