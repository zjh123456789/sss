package pers.zjh.thread.demo1.chapter1;

/**
 * @description: 测试线程执行随机性启动类
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-31 15:44
 */
public class RunRandom {

    public static void main(String[] args) throws InterruptedException {
        MyThreadRandom threadRandom = new MyThreadRandom();
        threadRandom.setName("threadRandom");
        threadRandom.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            Thread.sleep(time);
            System.out.println("main: " + Thread.currentThread().getName());
        }
    }
}
