package pers.zjh.thread.multi_thread.chapter1;

/**
 * sleep() 在指定的毫秒数内让当前"正在执行的线程"休眠(暂停执行)
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 11:21:19
 */
public class Sleep {
    public static void main(String[] args) {
        MyThread9 myThread9 = new MyThread9();
        System.out.println("begin = " + System.currentTimeMillis());
//        myThread9.run();
        myThread9.start();
        System.out.println("end = " +System.currentTimeMillis());
    }
}


class MyThread9 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
