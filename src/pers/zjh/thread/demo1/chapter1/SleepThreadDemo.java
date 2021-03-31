package pers.zjh.thread.demo1.chapter1;

/**
 * @description: sleep() : 在指定毫秒数让当前正在执行的线程休眠
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-31 17:04
 */
public class SleepThreadDemo extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName = " + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName = " + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
