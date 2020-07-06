package pers.zjh.thread.multi_thread.test1;

/**
 * 查看当前线程名称
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/6 17:50:34
 */
public class ThreadName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
