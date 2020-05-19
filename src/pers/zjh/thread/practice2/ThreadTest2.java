package pers.zjh.thread.practice2;

import java.math.BigDecimal;

/**
 * {todo}
 *
 * @author jinghui.zhu
 * @createTime 2020/4/11 21:15
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        System.out.println(System.nanoTime());

        BigDecimal a = BigDecimal.valueOf(10.4);

        System.out.println("a: " + a);

        BigDecimal b = a.multiply(BigDecimal.valueOf(0.01));

        System.out.println("b: " + b);
    }
}
