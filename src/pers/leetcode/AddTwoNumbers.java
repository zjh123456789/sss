package pers.leetcode;

/**
 * LeetCode 第二题 难易程度: Medium
 *
 * @author admin
 * @date 2019/3/11 17:03
 */

/**
 * 节点
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode newListNode = null;

        if (l1.next != null){
            l1 = l1.next;
        }
        if (l2.next != null){
            l2 = l2.next;
        }

        ListNode l1_reverse = null;
        ListNode l2_reverse = null;

        if (l1 != null){
            l1_reverse = l1;
            l1 = l1;
        }


        return newListNode;
    }

}
