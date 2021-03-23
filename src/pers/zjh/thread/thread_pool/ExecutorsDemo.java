package pers.zjh.thread.thread_pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @description: 为什么不推荐通过 Executors 直接创建线程池
 * <p>
 * 【强制】线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
 * 说明： Executors 返回的线程池对象的弊端如下：
 * 1) FixedThreadPool 和 SingleThreadPool: 允许的请求队列长度为 Integer.MAX_VALUE，可能会堆积大量的请求，从而导致 OOM；
 * 2) CachedThreadPool 和 ScheduledThreadPool: 允许的创建线程数量为 Integer.MAX_VALUE，可能会创建大量的线程，从而导致 OOM。
 * <p>
 * 原因：：java中BlockingQueue主要有两种实现，分别是ArrayBlockingQueue和LinkedBlockingQueue。ArrayBlockingQueue是一个用数组实现的有界阻塞队列，必须设置容量。
 * 而LinkedBlockingQueue是一个用链表实现的有界阻塞队列，容量可以选择进行设置，不设置的话，将是一个无边界的阻塞队列，最大长度为Integer.MAX_VALUE.
 * <p>
 * 查看new SingleExecutor时的源码可以发现，在创建LinkedBlockingQueue时，并未指定容量。
 * 此时，LinkedBlockingQueue就是一个无边界队列，对于一个无边界队列来说，是可以不断的向队列中加入任务的，这种情况下就有可能因为任务过多而导致内存溢出的问题。
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-23 11:18
 */
public class ExecutorsDemo {

    /**
     * 创建固定数目的线程池
     */
    private static ExecutorService executorService = Executors.newFixedThreadPool(15);

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executorService.execute(new SubThread());
        }
    }

    /**
     * 直接调用 ThreadPoolExecutor 的构造函数创建线程池
     */
    private static ExecutorService service = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));

    /**
     * 线程池工具类
     *
     * @param threadPoolName  线程池名称
     * @param corePoolSize    核心线程数
     * @param maximumPoolSize 最大线程数
     * @param queueSize       队列容量
     * @return 线程池
     */
    public static ExecutorService getExecutorService(String threadPoolName, int corePoolSize, int maximumPoolSize, int queueSize) {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat(threadPoolName + "-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>(queueSize),
                namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        return pool;
    }
}

class SubThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 创建线程池的正确方法：
 * 避免使用 Executors 创建线程池，主要是避免使用其中的默认实现，那么我们可以自己直接调用 ThreadPoolExecutor 的构成函数自己创建线程池。在创建的同时，给 BlockQueue 指定容量就可以了。
 * <p>
 * 这种情况下，一旦提交的线程数超过当前可用线程数时，就会抛出 java.util.concurrent.RejectedExecutionException, 这是因为当前线程池使用的队列是有界边界队列，队列已经满了便无法继续处理新的请求。
 * 但是异常（Exception）总比发生错误（Error）好
 */