package test.sort.bubblesort;

/**
 * Created by qingcai.zqc on 2016/4/21.
 * http://www.cnblogs.com/kkun/archive/2011/11/23/2260280.html
 */
public class BubbleSort {

    private static int[] unsort = {5, 1, 7, 11, 3, 9, 0};

    /**
     * 原则：竖直一列，最下面的(high)和上一个比，小的浮上来，一直比到第一个(low)。循环执行。
     * @param unsort
     */
    private void sort(int[] unsort){
        for(int i=0; i<unsort.length; i++){
            for(int j=i; j<unsort.length; j++){
                if(unsort[i] > unsort[j]){
                    swap(i, j);
                }
            }
        }
    }

    public void test(){
        sort(unsort);
        System.out.println("\nBubble sort:");
        for(int x: unsort){
            System.out.print(x + ",");
        }
        System.out.println("\n");
    }

    private void swap(int left, int right){
        int temp = unsort[left];
        unsort[left] = unsort[right];
        unsort[right] = temp;
    }
}
