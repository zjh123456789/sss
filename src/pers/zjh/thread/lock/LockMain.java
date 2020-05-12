package pers.zjh.thread.lock;

/**
 * main
 *
 * @author 朱景辉
 * @createTime 2020/4/19 9:10
 */
public class LockMain {

    public static void main(String[] args) throws InterruptedException {

        final LockTest lockTest = new LockTest();

        Thread t0 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        lockTest.doBusiness();
                    }
                }
        );

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        lockTest.doBusiness();
                    }
                }
        );

        // 启动线程t0
        t0.start();
        Thread.sleep(10);
        System.out.println("当前线程: " + Thread.currentThread().getName());
        // 启动线程t1
        t1.start();
        Thread.sleep(100);
        // 线程t1未获取到锁,中断t1的等待
        t1.interrupt();
    }
}
