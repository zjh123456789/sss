package pers.zjh.algorithm.leetcode.linked_list;


/**
 * 移除链表倒数第N个节点  Remove Nth Node From End of List
 * 难度：Medium
 *
 * @author jinghui.zhu
 * @date 2019/5/18 14:54
 */
public class LeetCode19 {

    public static void main(String[] args) {
        // 创建节点
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        // 连接节点，组成链表
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        // 调用方法
        ListNode result = removeNthFromEnd(l1, 2);

        // 打印链表
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

        System.out.println("linked_list: " + "solution");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        // 做个标记
        ListNode result = head;

        // 求出当前链表长度
        int length = 0;
        while (head != null){
            head = head.next;
            length++;
        }

        // head 从头数
        head = result;

        // 记录从左往右应该删除某个元素的下表
        int m = length - n;

        // 如果移除的元素刚好是链表第一个元素
        if (m == 0){
            return result.next;
        }

        int i = 0;
        while (head != null){
            if (i == m - 1){
                // 移除应该删除的节点
                head.next = head.next.next;
                break;
            }
            head = head.next;
            i++;
        }
        return result;
    }

}



