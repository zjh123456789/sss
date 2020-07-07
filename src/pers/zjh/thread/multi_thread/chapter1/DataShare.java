package pers.zjh.thread.multi_thread.chapter1;

/**
 * 实例变量与线程安全 - 数据共享 不安全
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 10:07:11
 */
public class DataShare {
    public static void main(String[] args) {
        MyThread5 myThread = new MyThread5();
        // 构造方法参数里使用同一个线程变量，共享数据
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

class MyThread5 extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        /**
         * count-- 在 JVM 里分为三步：
         * 1. 取得原有 count 值
         * 2. 计算 count - 1
         * 3. 对 count 进行赋值
         */
        count--;
        // 此处不使用 for 循环，否则其他线程得不到运行的机会了
        System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}
