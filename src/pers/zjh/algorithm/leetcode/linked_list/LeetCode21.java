package pers.zjh.algorithm.leetcode.linked_list;

/**
 * 合并有序链表   Merge Two Sorted Lists
 * difficulty: Easy
 *
 * @author jinghui.zhu
 * @date 2019/5/18 15:35
 */
public class LeetCode21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);

        System.out.println("合并后链表为: ");
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        // l1链表为空的情况
        if (l1 == null){
            return l2;
        }

        // l2链表为空的情况
        if (l2 == null){
            return l1;
        }

        // 初始化新链表
        ListNode newListNode = new ListNode(0);
        if (l1.val <= l2.val){
            newListNode.val = l1.val;
            l1 = l1.next;
        }else {
            newListNode.val = l2.val;
            l2 = l2.next;
        }

        // 标记头节点
        ListNode result = newListNode;

        // 顺序小的节点在前
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                newListNode.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                newListNode.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            newListNode = newListNode.next;
        }

        if (l1 == null){
            newListNode.next = l2;
        }

        if (l2 == null){
            newListNode.next = l1;
        }

        return result;
    }
}
