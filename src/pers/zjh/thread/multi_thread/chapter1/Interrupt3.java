package pers.zjh.thread.multi_thread.chapter1;

/**
 * 解决 for 语句继续运行的问题
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 14:53:12
 */
public class Interrupt3 {
    public static void main(String[] args) {
        try {
            MyThread13 myThread13 = new MyThread13();
            myThread13.start();
            Thread.sleep(2000);
            myThread13.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}


class MyThread13 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println(" 已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println(" 我在 for 下面");
            }
        } catch (InterruptedException e) {
            System.out.println(" 进MyThread13.java 类 run 方法中的 catch 了！");
            e.printStackTrace();
        }
    }
}
