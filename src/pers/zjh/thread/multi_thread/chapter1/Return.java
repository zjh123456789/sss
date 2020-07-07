package pers.zjh.thread.multi_thread.chapter1;

/**
 * 使用方法 interrupt() 和 return 结合起来也可以实现停止线程的效果
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 17:24:01
 */
public class Return {
    public static void main(String[] args) {
        MyThread17 myThread17 = new MyThread17();
        myThread17.start();
        try {
            Thread.sleep(2000);
            myThread17.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread17 extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println(" 停止了");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
