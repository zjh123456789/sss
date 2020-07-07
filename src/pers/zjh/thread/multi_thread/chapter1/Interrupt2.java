package pers.zjh.thread.multi_thread.chapter1;

/**
 * 能停止的线程 - 异常法
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 14:48:24
 */
public class Interrupt2 {
    public static void main(String[] args) {
        try {
            MyThread12 myThread12 = new MyThread12();
            myThread12.start();
            Thread.sleep(2000);
            myThread12.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}

class MyThread12 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i ++) {
            if (this.interrupted()) {
                System.out.println(" 已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println(" 我被输出，如果此代码是 for 又继续运行，线程并未停止！ ");
    }
}
