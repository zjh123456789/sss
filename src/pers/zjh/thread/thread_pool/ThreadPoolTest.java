package pers.zjh.thread.thread_pool;

import java.util.concurrent.*;

/**
 * 线程池测试类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/5/9 11:13:44
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
        ThreadFactory factory = r -> new Thread(r, "test-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.SECONDS, queue, factory);
        while (true) {
            executor.submit(() -> {
                try {
                    System.out.println(queue.size());
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}
