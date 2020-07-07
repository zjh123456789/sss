package pers.zjh.thread.multi_thread.chapter1;

/**
 * isAlive() 判断当前线程是否处于活动状态
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 11:13:12
 */
public class Alive {
    public static void main(String[] args) throws InterruptedException {
        MyThread8 myThread8 = new MyThread8();
        System.out.println("begin ==" + myThread8.isAlive());
        myThread8.start();
        Thread.sleep(1000);
        System.out.println("end ==" + myThread8.isAlive());
    }
}

class MyThread8 extends MyThread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
