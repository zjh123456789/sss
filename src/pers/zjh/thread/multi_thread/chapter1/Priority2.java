package pers.zjh.thread.multi_thread.chapter1;

import lombok.Data;

/**
 * 优先级高的线程运行得快
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/8 09:24:07
 */
public class Priority2 {
    public static void main(String[] args) {
        System.out.println("Integer 最大值：" + Integer.MAX_VALUE);
        System.out.println("Integer 最小值：" + Integer.MIN_VALUE);
        MyThread21 myThread21 = new MyThread21();
        myThread21.setPriority(Thread.NORM_PRIORITY - 3);
        myThread21.start();
        MyThread22 myThread22 = new MyThread22();
        myThread22.setPriority(Thread.NORM_PRIORITY + 3);
        myThread22.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread21.stop();
        myThread22.stop();
        System.out.println("21=" + myThread21.getCount());
        System.out.println("22=" + myThread22.getCount());
    }
}

@Data
class MyThread21 extends Thread {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}

@Data
class MyThread22 extends Thread {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
