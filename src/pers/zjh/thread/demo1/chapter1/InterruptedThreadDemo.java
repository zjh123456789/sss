package pers.zjh.thread.demo1.chapter1;

/**
 * @description: interrupted() : 测试当前线程是否已经中断
 *
 * 当前线程是指运行了 this.interrupted() 方法的线程
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-04-01 13:33
 */
public class InterruptedThreadDemo extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 400000; i++) {
            System.out.println("i= " + (i+1));
        }
    }
}
