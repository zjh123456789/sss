package pers.zjh.algorithm.leetcode.math;

/**
 * 字符串转整数   String to Integer
 * difficulty: Medium
 *
 * @author jinghui.zhu
 * @date 2019/3/20 10:35
 */
public class LeetCode08 {
    public static void main(String[] args) {
        String s = "3232 323dsa sdfsa  ";
        System.out.println(myAtoi(s));
    }

    /**
     * 字符串转换为整数
     *
     * @param str 字符串
     * @return 整数
     */
    public static int myAtoi(String str){
        int result = 0;
        // 先去除字符串两端的所有空格
        str = str.trim();
        char[] chars = str.toCharArray();
        boolean isNegative = false;
        for (int i=0; i<str.length(); i++){
            // 先判断字符串的第一个字符 讨论 3 种情况
            // 1. '-' 表明是负数，做个标记
            // 2. '+' 显示表明是整数，继续遍历下一个字符
            // 3. 在 0 - 9 之间，结果保存下来
            // 4. 其余所有情况表明不能转换为整数，直接退出!
            if (i == 0){
                if (chars[i] == '-'){
                    isNegative = true;
                }else if(chars[i] >= '0' && chars[i] <= '9'){
                    result = result*10 + (chars[i] - '0');
                }else if(chars[i] == '+'){
                    continue;
                }else {
                    break;
                }
            }else {
                // 从第二个字符开始遍历，分两种情况
                // 1. 字符在 0 - 9 之间，又分 3 种情况
                //    1.1 正数情况下，判断是否大于 int 类型最大值，若超出，返回 int 型最大值
                //    1.1 负数情况下，判断是否小于 int 类型最小值，若小于，返回 int 型最小值
                //    1.3 其余情况下，均 * 10 再加当前字符对应的数值
                // 2. 其余字符直接退出
                if (chars[i]>='0' && chars[i]<='9'){
                    if ((!isNegative) && (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && (chars[i] - '0' > 7))){
                        return Integer.MAX_VALUE;
                    }
                    if (isNegative && (-1 * result < Integer.MIN_VALUE / 10 || (-1 * result == Integer.MIN_VALUE / 10 && (chars[i] - '0' > 8)))){
                        return Integer.MIN_VALUE;
                    }
                    result = result*10 + (chars[i] -'0');
                } else {
                    break;
                }
            }
        }
        if (isNegative){
            return -1 * result;
        }
        return result;
    }
}
