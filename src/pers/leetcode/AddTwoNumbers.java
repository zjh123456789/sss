package pers.leetcode;

/**
 * LeetCode 02 Add Two Numbers
 * 难易程度: Medium
 *
 * @author admin
 * @date 2019/3/11 17:03
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode cur1 = l1;
        cur1.next = new ListNode(4);
        cur1 = cur1.next;
        cur1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode cur2 = l2;
        cur2.next = new ListNode(6);
        cur2 = cur2.next;
        cur2.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    /**
     * 尾插法 插入节点
     *
     * @param l1 第一个链表
     * @param l2 第二个链表
     * @return 结果链表
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null){
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null) ? l2.val : 0;
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry ==  1 ){
            curr.next = new ListNode(1);
        }
        return dummyHead.next;
    }

}

/**
 * 单向链表节点
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}