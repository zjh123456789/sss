package pers.zjh.thread.demo1.chapter1;

/**
 * @description: 演示线程执行顺序的随机性
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-31 15:40
 */
public class MyThreadRandom extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("正在运行的线程是: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
