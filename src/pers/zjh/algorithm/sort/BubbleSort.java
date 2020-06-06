package pers.zjh.algorithm.sort;

/**
 * 冒泡排序算法
 *
 * @author jinghui.zhu
 * @date 2019/3/11 16:06
 * @version 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        System.out.println("原始数组: " );
        print(arr);
        System.out.println("开启冒泡模式:小数渐渐浮出水面: ");
        bubble(arr);
    }


    /**
     * 冒泡排序：大数沉底，小数渐渐浮出水面
     *
     * n 个数字，外循环比较 n - 1 轮，每一轮沉底 1 个数子。第 i 轮以后的每一轮都可少比较 i 个数字
     *
     * n - 1 轮后，沉底 n - 1 个数字，完成排序.
     *
     * @param array 待排序的数组
     */
    private static void bubble(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j + 1);
                }
            }
            System.out.println("第" + i + "趟冒泡结果为:");
            print(array);
        }
    }

    /**
     * 交换数组中两个元素的位置
     *
     * @param arr   数组
     * @param i     一个下标
     * @param j     另一个下标
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     * 打印数组
     *
     * @param array 待打印的数组
     */
    private static void print(int[] array){
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
