package pers.zjh.thread.demo1.chapter1;

/**
 * @description: 继承 Thread 类实现多线程
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-29 21:56
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread: " + Thread.currentThread().getName());
    }
}
