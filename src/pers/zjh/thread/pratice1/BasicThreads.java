package pers.zjh.thread.pratice1;

/**
 * basic 线程测试类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/10 20:51:31
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
