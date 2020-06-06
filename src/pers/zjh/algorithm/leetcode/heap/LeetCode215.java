package pers.zjh.algorithm.leetcode.heap;

import java.util.PriorityQueue;

/**
 * 数组中的第K个最大元素：
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 *
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 *
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/6/6 15:27:42
 */
public class LeetCode215 {

    public static void main(String[] args) {
        System.out.println("算法215开始");
        int[] array = {3,2,1,5,6,4};
        int k = 2;
        int result = findKthLargest(array, k);
        System.out.println("第 k 大元素: " + result);
    }

    public static int findKthLargest(int[] nums, int k) {
        // 初始化堆 "最小的元素优先"
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n1 - n2);

        // 在堆中保留 k 个最大元素
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
    }
}
