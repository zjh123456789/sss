/**
 * 堆（Heap）是一个可以被看成近似完全二叉树的数组。树上的每一个结点对应数组的一个元素。除了最底层外，该树是完全充满的，而且是从左到右填充。—— 来自：《算法导论》
 *
 * 堆包括最大堆和最小堆：最大堆的每一个节点（除了根结点）的值不大于其父节点；最小堆的每一个节点（除了根结点）的值不小于其父节点。
 *
 * 堆常见的操作：
 *
 * HEAPIFY 建堆：把一个乱序的数组变成堆结构的数组，时间复杂度为 O(n)O(n)。
 * HEAPPUSH：把一个数值放进已经是堆结构的数组中，并保持堆结构，时间复杂度为 O(log\ n)O(log n)。
 * HEAPPOP：从最大堆中取出最大值或从最小堆中取出最小值，并将剩余的数组保持堆结构，时间复杂度为 O(log\ n)O(log n)。
 * HEAPSORT：借由 HEAPFY 建堆和 HEAPPOP 堆数组进行排序，时间复杂度为 O(n\ log\ n)O(n log n)，空间复杂度为 O(1)O(1)。
 * 堆结构的一个常见应用是建立优先队列（Priority Queue）。
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/5/13 17:18:37
 */
package pers.zjh.algorithm.leetcode.heap;
