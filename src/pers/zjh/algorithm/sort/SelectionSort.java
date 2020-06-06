package pers.zjh.algorithm.sort;

/**
 * 选择排序算法
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/6/6 16:53:19
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 9, 4, 1};
        int[] sort = selectionSort(arr);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }

    private static int[] selectionSort(int[] array) {
        if (null == array || array.length == 0) {
            return null;
        }

        // i 个元素， 则需要找出 i - 1 个数（从大到小 or 从小到大）
        for (int i = 0; i < array.length - 1; i++) {
            // 先假设每次循环时, 最小数的索引为 i
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                // 当遇到比当前值小的元素，将其下标赋值给当前值，直至遍历完一轮元素， 定位此轮最小元素下标
                if (array[maxIndex] > array[j]) {
                    maxIndex = j;
                }
            }
            // 将最小元素放到 i 的位置
            swap(array, i, maxIndex);
        }
        return array;
    }

    /**
     * 交换数组中两个元素的位置
     * @param arr   数组
     * @param i     一个下标
     * @param j     另一个下标
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
