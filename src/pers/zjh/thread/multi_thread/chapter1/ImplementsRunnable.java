package pers.zjh.thread.multi_thread.chapter1;

/**
 * 实现多线程编程的方式一: 实现 Runnable 接口
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 09:08:44
 */
public class ImplementsRunnable {
    public static void main(String[] args) {
        Runnable runnable = new RunnableTest();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束~");
    }
}

class RunnableTest implements Runnable {

    @Override
    public void run() {
        System.out.println("运行中");
    }
}
