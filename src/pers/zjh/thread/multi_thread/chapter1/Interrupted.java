package pers.zjh.thread.multi_thread.chapter1;

/**
 * interrupted() - 测试当前线程是否已经中断，执行后具有将状态标志置清除为 false 的功能
 * isInterrupted() - 测试线程是否已经中断，不清除状态标志
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 13:40:28
 */
public class Interrupted {
    public static void main(String[] args) {
        try {
            MyThread11 myThread11 = new MyThread11();
            myThread11.start();
            Thread.sleep(1000);
            myThread11.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println(" 是否停止 1 ？ =" + myThread11.interrupted());
            System.out.println(" 是否停止 2 ？ =" + myThread11.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}


class MyThread11 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
