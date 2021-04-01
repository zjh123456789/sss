package pers.zjh.thread.demo1.chapter1;

/**
 * interrupt()：在当前线程中打了一个停止标记，并不是真的停止线程
 *
 * @author 朱景辉
 * @createTime 2021/4/1 8:04
 */
public class InterruptThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i+1));
        }
    }
}
