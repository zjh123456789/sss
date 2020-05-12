package pers.zjh.algorithm.leetcode.string;

/**
 * 最长公共前缀   Longest Common Prefix
 * difficulty: Easy
 *
 * @author jinghui.zhu
 * @date 2019/4/26 10:18
 */
public class LeetCode14 {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(strs);
        System.out.println("最长公共前缀是: " + commonPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
