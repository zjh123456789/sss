package pers.zjh.thread.multi_thread.test1;

/**
 * 线程的调用随机性测试
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/6 18:04:16
 */
public class RandomTest {

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("myThread2");
        myThread2.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
