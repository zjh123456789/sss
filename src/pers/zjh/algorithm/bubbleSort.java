package pers.zjh.algorithm;

/**
 * 冒泡排序算法
 *
 * @author 朱景辉
 * @date 2019/3/11 16:06
 * @version 1.0
 */
public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        System.out.println("原始数组: " );
        print(arr);
        System.out.println("开启冒泡模式:小数渐渐浮出水面: ");
        bubble(arr);
    }


    /**
     * 冒泡排序
     *
     * @param array 待排序的数组
     */
    public static void bubble(int[] array){
        for (int i=1; i<array.length; i++){
            for (int j=0; j<array.length-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println("第"+i+"趟冒泡结果为:");
            print(array);
        }
    }

    /**
     * 打印数组
     *
     * @param array 待打印的数组
     */
    public static void print(int[] array){
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
