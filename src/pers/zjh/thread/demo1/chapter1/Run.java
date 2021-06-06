package pers.zjh.thread.demo1.chapter1;

/**
 * @description: 运行测试类
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-29 21:58
 */
public class Run {

    public static void main(String[] args) {
//        // 继承 Thread 类
//        System.out.println(Thread.currentThread().getName());
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("运行结束1！");
//
//        // 实现 Runnable 接口
//        Runnable runnable = new RunMyThread();
//        Thread runMyThread = new Thread(runnable);
//        runMyThread.start();
//        System.out.println("运行结束2");
//
//        // isAlive() 方法
//        IsAliveDemo isAliveDemo = new IsAliveDemo();
//        System.out.println("begin == " + isAliveDemo.isAlive());
//        isAliveDemo.start();
//        System.out.println("end == " + isAliveDemo.isAlive());

//        // sleep() 方法
//        SleepThreadDemo sleepThreadDemo = new SleepThreadDemo();
//        System.out.println("begin " + System.currentTimeMillis());
//        sleepThreadDemo.run();
//        // sleepThreadDemo.start();
//        System.out.println("end " + System.currentTimeMillis());

//        // interrupt() 方法
//        try {
//            InterruptThreadDemo interruptThreadDemo = new InterruptThreadDemo();
//            interruptThreadDemo.start();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println("main catch");
//            e.printStackTrace();
//        }

//        // interrupted() 方法
//        try {
//            InterruptedThreadDemo interruptedThreadDemo = new InterruptedThreadDemo();
//            interruptedThreadDemo.start();
//            Thread.sleep(1000);
//            // Thread.currentThread().interrupt();
//            interruptedThreadDemo.interrupt();
//            System.out.println("是否停止1 : " + interruptedThreadDemo.interrupted());
//            System.out.println("是否停止2 : " + interruptedThreadDemo.interrupted());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        // 使 main 线程产生中断效果
//        Thread.currentThread().interrupt();
//        System.out.println("是否停止1 : " + Thread.interrupted());
//        System.out.println("是否停止2 : " + Thread.interrupted());
//        System.out.println("end");

        // isInterrupted()
        try {
            InterruptedThreadDemo interruptedThreadDemo = new InterruptedThreadDemo();
            interruptedThreadDemo.start();
            Thread.sleep(1000);
            interruptedThreadDemo.interrupt();
            System.out.println("是否停止1 : " + interruptedThreadDemo.isInterrupted());
            System.out.println("是否停止2 : " + interruptedThreadDemo.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
