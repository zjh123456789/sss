package pers.zjh.thread.multi_thread.chapter1;

/**
 * 实例变量与线程安全 - 数据共享 安全
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 10:33:20
 */
public class DataShare2 {
    public static void main(String[] args) {
        MyThread6 myThread = new MyThread6();
        // 构造方法参数里使用同一个线程变量，共享数据
        Thread aa = new Thread(myThread, "AA");
        Thread bb = new Thread(myThread, "BB");
        Thread cc = new Thread(myThread, "CC");
        Thread dd = new Thread(myThread, "DD");
        Thread ee = new Thread(myThread, "EE");
        aa.start();
        bb.start();
        cc.start();
        dd.start();
        ee.start();
    }
}


class MyThread6 extends Thread {
    private int count = 5;

    // synchronized 关键字，使多个线程在执行 run 方法时，以排队的方式进行处理
    // synchronized 可以在任意对象及方法上锁，加锁的这段代码称为"互斥区"或"临界区"
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}
