package pers.zjh.algorithm.other;

import java.util.Scanner;

/**
 * 计算字符串中含有的不同字符的个数，字符在 ACSII 码范围内（0~127），不在范围的不作统计
 *
 * @author 朱景辉
 * @createTime 2020/3/31 21:07
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            int len = getLen(s);
            System.out.println(len);
        }
    }

    private static int getLen(String s) {
        int[] arr = new int[128];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)] = 1;
        }
        int len = 0;
        for (int value : arr) {
            if (value == 1) {
                len++;
            }
        }
        return len;
    }
}
