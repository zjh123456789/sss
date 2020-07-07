package pers.zjh.thread.multi_thread.chapter1;

/**
 * 调用 stop() 方法时会抛出 java.lang.ThreadDeath 异常
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 15:15:07
 */
public class Stop2 {

    public static void main(String[] args) {
        MyThread15 myThread15 = new MyThread15();
        myThread15.start();
    }
}

class MyThread15 extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了 catch() 方法！ ");
            e.printStackTrace();
        }
    }
}
