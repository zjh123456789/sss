package pers.zjh.algorithm.sort;

/**
 * 堆排序
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/6/6 17:29:07
 */
public class HeapSort {

    // 声明全局变量，用于记录数组 array 的长度
    static int len;

    /**
     * 堆排序算法
     *
     * @param array
     * @return
     */
    public static int[] HeapSort(int[] array) {
        len = array.length;
        if (len < 1) return array;
        //1.构建一个最大堆
        buildMaxHeap(array);
        //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        while (len > 0) {
            swap(array, 0, len - 1);
            len--;
            adjustHeap(array, 0);
        }
        return array;
    }

    // 建立一个最大堆
    private static void buildMaxHeap(int[] array) {
        // 从最后一个非叶子节点开始向上构造最大堆
        // for 循环这样写更好一点: i 的左子树和右子树分别为 2i + 1 和 2(i+1)
        for (int i = (len/2 - 1); i >= 0; i--) {
            adjustHeap(array, i);
        }
    }

    // 调整使之成为最大堆
    private static void adjustHeap(int[] array, int i) {
        int maxIndex = i;
        // 如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 < len && array[i * 2] > array[maxIndex]) {
            maxIndex = i * 2;
        }
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex])
            maxIndex = i * 2 + 1;
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustHeap(array, maxIndex);
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

}
