package pers.zjh.algorithm.leetcode.math;

/**
 * 整数转化为罗马数字    Integer to Roman
 * difficulty: Medium
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/18 16:43
 */
public class LeetCode12 {

    public static void main(String[] args) {
        int num = 9;
        System.out.println("转换后的罗马数字为: " + intToRoman(num));
    }

    public static String intToRoman(int num){
        String res = "";
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < roman.length; i++){
            while (num >= value[i]){
                res += roman[i];
                num -= value[i];
            }
        }
        return res;
    }
}
