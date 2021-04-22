package pers.zjh.thread.multi_thread.chapter6;

/**
 * @description: 单例模式 - 饿汉
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-04-08 11:30
 */
public class Hungry {

    // 立即加载方式 == 饿汉模式
    private static Hungry hungry = new Hungry();

    private Hungry() {

    }

    public static Hungry getInstance() {
        /**
         * 立即加载
         * 缺点：类加载时就初始化，浪费内存，instance 在类装载时就初始化
         */
        return hungry;
    }
}
