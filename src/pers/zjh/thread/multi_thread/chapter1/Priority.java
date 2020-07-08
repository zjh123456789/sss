package pers.zjh.thread.multi_thread.chapter1;

/**
 * 线程的优先级具有继承性，比如 A 线程启动 B 线程，则 B 线程的优先级与 A 是一样的
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/8 09:08:53
 */
public class Priority {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread19 myThread19 = new MyThread19();
        myThread19.start();
    }
}

class MyThread19 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread19 run priority=" + this.getPriority());
        MyThread20 myThread20 = new MyThread20();
        myThread20.start();
    }
}

class MyThread20 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread20 run priority=" + this.getPriority());
    }
}
