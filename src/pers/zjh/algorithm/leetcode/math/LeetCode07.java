package pers.zjh.algorithm.leetcode.math;

/**
 * LeetCode 07 翻转整数
 * difficulty: Easy
 *
 * @author jinghui.zhu
 * @date 2019/3/19 17:30
 */
public class LeetCode07 {

    public static void main(String[] args) {
        System.out.println("Integer 类型最小值: " + Integer.MIN_VALUE);
        System.out.println("Integer 类型最大值: " + Integer.MAX_VALUE);
        int a = -2143648;
        System.out.println(reverse(a));
    }

    /**
     * 反转一个 32 - bit 的带符号整数
     * @param x int 型值
     * @return 反转后的值
     */
    public static int reverse(int x){
        int rev = 0;
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && pop > 7)
                return 0;
            if (rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && pop < (-8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
