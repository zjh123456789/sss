package pers.zjh.algorithm;

/**
 * 插入排序算法
 *
 * @author admin
 * @date 2019/3/11 15:22
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = {2,4,3,1,6,5};

        System.out.println("before sort: ");
        for (int i=0; i<a.length; i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("%n");

        insertSort(a, a.length);

        System.out.println("after sort: ");
        for (int i=0; i<a.length; i++){
            System.out.printf("%d ",a[i]);
        }
    }

    /**
     * 直接插入排序
     *
     * @param a 待排序的数组
     * @param n 数组的长度
     */
    public static void insertSort(int[] a, int n){
        int i, j, k;

        for (i = 1; i<n; i++){
            // 为a[i]在前面的a[0...i-1]有序区间找一个合适的位置
            for (j = i - 1; j >= 0; j--){
                if (a[j] < a[i]){
                    break;
                }
            }

            // 如找到了一个合适的位置
            if (j != i -1){
                // 将比a[i]大的数据向后移
                int temp = a[i];
                for (k = i - 1; k>j; k--){
                    a[k+1] = a[k];
                }
                // 将a[i]放到正确位置上
                a[k+1] =temp;
            }
        }
    }
}
