package test.sort.insertsort;

/**
 * 打扑克 ， 牌多的时候怎么整理呢？就是拿到一张牌，找到一个合适的位置插入。
 * 首先假设第一个数的位置时正确的，想一下在拿到第一张牌的时候，找到大小合适的位置，
 * 在插入一个数的时候要保证这个数前面的数已经有序。
 * Created by qingcai.zqc on 2016/4/21.
 */
public class InsertSort {

    private static int[] unsort = {5, 1, 7, 11, 3, 9, 0};

    public void test(){
        insertSort();
        System.out.println("\ninsert sort:");
        for(int x: unsort){
            System.out.print(x + ",");
        }
        System.out.println("\n");
    }

    private void insertSort(){
        for(int i=1; i<unsort.length; i++){
            for(int j=0; j<i; j++){
                if(unsort[j] > unsort[i]){
//                    int temp = unsort[i];
//                    //把元素后移一个。
//                    int x=j;
//                    for(; x<i-j; x++){
//                        unsort[i+x] = unsort[i+x-1];
//                    }
//                    unsort[i+x-1] = temp;
                }
            }
        }
    }

}
