package pers.zjh.thread.multi_thread.chapter1;

/**
 * 实现多线程编程的方式一: 继承 Thread 类
 * 存在局限性： Java 是单根继承，不支持多继承。
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/6 18:00:50
 */
public class ExtendsThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束! ");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
