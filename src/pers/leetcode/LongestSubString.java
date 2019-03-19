package pers.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 03 Longest Substring Without Repeating Characters
 * 难易程度: Medium
 *
 * @author admin
 * @date 2019/3/13 13:01
 */
public class LongestSubString {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxSubStinglenggth =  slidingWindow(s);
        System.out.println("最长子串长度 : " + maxSubStinglenggth);
    }

    /**
     * 暴力求解
     *
     * @param s 字符串
     * @return 子串长度
     */
    public static int lengthOfLongestSubString(String s){
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = i; j <= n; j++){
                if (allUnique(s, i, j)){
                    ans = Math.max(ans, j-i);
                }
            }
        }
        return ans;
    }

    /**
     * 判断子串是否字符是否各不相同
     *
     * @param s 字符串
     * @param start 起始位置
     * @param end 终结位置
     * @return 是否每个都是唯一的
     */
    public static boolean allUnique(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++){
            Character ch = s.charAt(i);
            if (set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    /**
     * 解法二 : 滑动窗口
     *
     * @param s 字符串
     */
    public static int slidingWindow(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n){
            //尝试扩展[i,j]的范围
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    /**
     * 最优化解法, 使用 HashMap
     *
     * @param s 字符串
     */
    public static int optimized(String s){
        int n = s.length(), ans = 0;
        // current index of character
        Map<Character, Integer> map = new HashMap<>();
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
