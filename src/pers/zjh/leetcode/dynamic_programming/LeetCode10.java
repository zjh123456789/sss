package pers.zjh.leetcode.dynamic_programming;

/**
 * 正则表达式匹配  Regular Expression Matching
 * difficulty: Hard
 *
 * @author 朱景辉
 * @date 2019/3/21 9:49
 */
public class LeetCode10 {
    public static void main(String[] args) {
        String s = "ab";
        String p = ".*c";
        System.out.println("是否匹配: " + isMatch(s, p));
    }

    /**
     * 递归解法
     *
     * @param text 给定字符串
     * @param pattern 匹配字符串
     * @return 匹配结果
     */
    public static boolean isMatch(String text, String pattern){
        // 先处理特殊情况，pattern 为空的情况下，text为空返回true,否则返回false
        if (pattern.isEmpty()){
            return text.isEmpty();
        }
        // 首先比较双方第一个字符是否相同，2 种情况
        // 1. 两者第一个字符相同
        // 2. pattern 的第一个字符是 '.'
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        // 递归处理两种情况
        // 1. pattern长度大于等于 2 ,且第 2 个字符为'*'
        // 2. 要么 pattern 长度为1，要么长度大于等于 2，但第二个字符不为 '*'
        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            // 这里返回也有两种情况
            // 1. '*' 将其前一个字符置空，再从 text 的第一个字符 与 pattern 的第三个字符匹配
            // 2. '*' 目前重复 1 次， 与 text 第一个字符匹配到了，再用 text 的第二个字符 与 pattern 的第一个字符匹配
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        }else {
            // 只有双方第一个字符相同 且 剩余字符匹配 才返回 true
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    /**
     * 动态规划
     *
     * @param text 给定字符串
     * @param pattern 匹配字符串
     * @return 匹配结果
     */
    public static boolean isMatch2(String text, String pattern){
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() +1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--){
            for (int j = pattern.length() - 1; j>= 0; j--){
                // 双方最后一个字符是否相同 或者 pattern 最后一个字符为 '.'
                boolean first_match = (i < text.length() && (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));

                // 1. 从 pattern 倒数第二个字符起, 凡是等于 '*' 的情况
                // 2. 不等于 '*'
                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                }else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
}
