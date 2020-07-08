package pers.zjh.thread.multi_thread.chapter1;

/**
 * 守护线程 - Java 里有两种线程 - 用户线程 && 守护线程
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/8 10:00:31
 */
public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        MyThread23 myThread23 = new MyThread23();
        myThread23.setDaemon(true);
        myThread23.start();
        Thread.sleep(5000);
        System.out.println("我离开 thread 对象也不再打印了，也就是停止了！");
    }
}


class MyThread23 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
