package pers.zjh.thread.multi_thread.chapter1;

/**
 * stop() - 暴力停止线程
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 15:10:01
 */
public class Stop {
    public static void main(String[] args) {
        try {
            MyThread14 myThread14 = new MyThread14();
            myThread14.start();
            Thread.sleep(8000);
            myThread14.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread14 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
