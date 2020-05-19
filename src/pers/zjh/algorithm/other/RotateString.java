package pers.zjh.algorithm.other;

/**
 * 高频题目：给定一个字符串str和长度size，请把str左侧leftsize的部分和右部分做整体交换。
 * 要求额外空间复杂度O（1）
 *
 * 进阶：如果交换代价很昂贵，有没有更好一些的办法？
 *
 * @author jinghui.zhu
 * @createTime 2020/5/12 23:29
 */
public class RotateString {

    public static String rotate(String s, int leftSize) {
        if (leftSize <= 0 || leftSize >= s.length()) {
            return s;
        }
        return process1(s.toCharArray(), 0, leftSize - 1, s.length() - 1);
    }

    // 在 str 上, 如果认为str[l...m]是左部分, str[m+1...r]是右部分
    // 请原地调整, 只能用有限几个变量, 左 -> 右  右 -> 左
    private static String process1(char[] str, int l, int m, int r) {
        reverse(str, l, m);
        reverse(str, m + 1, r);
        reverse(str, l, r);
        return String.valueOf(str);
    }

    private static void reverse(char[] str, int l, int r) {
        while (l < r) {
            char temp = str[l];
            str[l++] = str[r];
            str[r--] = temp;
        }
    }

    // 当两个对象交换代价很大时，可采用这种方法
    public static String rotate2(String s, int leftSize) {
        if (leftSize <= 0 || leftSize >= s.length()) {
            return  s;
        }
        char[] str = s.toCharArray();
        int l = 0;
        int r = str.length - 1;
        int lpart = leftSize;
        int rpart = str.length - leftSize;
        int same = Math.min(lpart, rpart);
        int diff = lpart - rpart;
        exchange(str, l, r, same);
        while (diff != 0) {
            if (diff > 0) {
                l += same;
                lpart = diff;
            } else {
                l -= same;
                rpart = -diff;
            }
            same = Math.min(lpart, rpart);
            diff = lpart - rpart;
            exchange(str, l, r, same);
        }
        return String.valueOf(str);
    }

    private static void exchange(char[] str, int l, int r, int size) {
        int i = r - l + 1;
        char temp = 0;
        while (size-- != 0) {
            temp = str[l];
            str[l] = str[i];
            str[i] = temp;
            l++;
            i++;
        }
    }

}
