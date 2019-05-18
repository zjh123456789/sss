package pers.zjh.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转为整数     Roman to Integer
 * difficulty: Easy
 *
 * @author jinghui.zhu
 * @date 2019/4/25 9:35
 */
public class LeetCode13 {

    public static void main(String[] args) {
        String s = "IV";
        int value = romanToInt(s);
        System.out.println("罗马数字转为整数: " + value);
    }

    public static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int preNum = 0;
        int length = s.length();
        for (int i = length - 1; i >= 0; i--){
            char key = s.charAt(i);
            int value = map.get(key);

            if (value >= preNum){
                res += value;
            }else {
                res -= value;
            }

            preNum = value;
        }
        return res;
    }
}
