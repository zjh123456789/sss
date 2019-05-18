package pers.zjh.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟Z 字型字符串转换  ZigZag Conversion
 * difficulty: Medium
 *
 * @author jinghui.zhu
 * @date 2019/3/19 9:13
 */
public class LeetCode06 {

    public static void main(String[] args) {
       String output = convert("PAYPALISHIRING",3);
       System.out.println(output);

       System.out.println(convert2("PAYPALISHIRING",3));
    }

    /**
     * Z 字型字符转换
     * @param s 字符串
     * @param numRows 指定划分几行
     * @return 排列后的字符串
     */
    public static String convert(String s, int numRows){
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

    /**
     * Visit by Row
     *
     * @param s 字符串
     * @param numRows 指定划分几行
     * @return 排列后的字符串
     */
    public static String convert2(String s, int numRows){
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
