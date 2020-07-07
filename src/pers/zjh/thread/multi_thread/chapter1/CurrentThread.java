package pers.zjh.thread.multi_thread.chapter1;

/**
 * 查看当前线程名称
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/6 17:50:34
 */
public class CurrentThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread7 myThread7 = new MyThread7();
        myThread7.start();
        // myThread7.run();
    }
}

class MyThread7 extends Thread {
    public MyThread7() {
        System.out.println(" 构造方法的打印: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(" run 方法的打印: " + Thread.currentThread().getName());
    }
}
