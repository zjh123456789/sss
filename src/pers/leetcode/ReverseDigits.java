package pers.leetcode;

/**
 * LeetCode 07 反转整数
 * 难度: Easy
 *
 * @author admin
 * @date 2019/3/19 17:30
 */
public class ReverseDigits {

    public static void main(String[] args) {
        int a = -2147483648;
        System.out.println(reverse(a));
    }

    /**
     * 反转一个 32 - bit 的带符号整数
     * @param x
     * @return
     */
    public static int reverse(int x){
        int output = 0;
        StringBuilder ss = new StringBuilder("");
        if (x > (2 << 30 - 1) || x < -(2 << 30) || x == 0){
            return output;
        } else {
            if (x < 0){
                ss.append("-");
            }
            int a = Math.abs(x);
            String s = a + "";
            for (int i = s.length() - 1; i >= 0; i--){
                ss.append(s.charAt(i));
            }
        }
        output = Integer.parseInt(ss.toString());
        if (output > (2 << 30 - 1) || output < -(2 << 30)){
            output = 0;
        }
        return output;
    }
}
