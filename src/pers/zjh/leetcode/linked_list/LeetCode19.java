package pers.zjh.leetcode.linked_list;


/**
 * 移除链表倒数第N个节点  Remove Nth Node From End of List
 * 难度：Medium
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/18 14:54
 */
public class LeetCode19 {

    public static void main(String[] args) {
        System.out.println("linked_list: " + "solution");
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode node = new ListNode(1);
        int length = 0;
        while (node != null){
            node = node.getNext();
        }
        return node;
    }

}



