package pers.zjh.thread.multi_thread.chapter1;

/**
 * interrupt() - 打一个停止标记，并不是立即停止线程
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 13:34:45
 */
public class Interrupt {
    public static void main(String[] args) {
        try {
            MyThread10 myThread10 = new MyThread10();
            myThread10.start();
            Thread.sleep(2000);
            myThread10.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}


class MyThread10 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
