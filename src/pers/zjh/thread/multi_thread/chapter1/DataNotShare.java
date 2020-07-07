package pers.zjh.thread.multi_thread.chapter1;

/**
 * 实例变量与线程安全 - 数据不共享
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 09:59:06
 */
public class DataNotShare {
    public static void main(String[] args) {
        MyThread4 a = new MyThread4("A");
        MyThread4 b = new MyThread4("B");
        MyThread4 c = new MyThread4("C");
        a.start();
        b.start();
        c.start();
    }
}

class MyThread4 extends Thread {
    private int count = 5;
    public MyThread4(String name) {
        super();
        // 设置线程名称
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
        }
    }
}
