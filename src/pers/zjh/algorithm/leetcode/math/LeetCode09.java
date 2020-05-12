package pers.zjh.algorithm.leetcode.math;

/**
 * 判断回文数字   Palindrome Number
 * difficulty: Easy
 *
 * @author 朱景辉
 * @date 2019/3/20 11:39
 */
public class LeetCode09 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }

    /**
     * 判断回文数字
     *
     * @param x int 型数字
     * @return boolean
     */
    public static boolean isPalindrome(int x){
        if (x < 0)
            return false;
        String str = x + "";
        for (int i=0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
}
