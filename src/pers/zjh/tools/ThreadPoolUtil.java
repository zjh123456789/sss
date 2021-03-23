package pers.zjh.tools;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @description: 线程池工具类
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-23 14:46
 */
public class ThreadPoolUtil {

    private volatile static ExecutorService executorService;

    private ThreadPoolUtil() {
    }

    /**
     * 创建线程池
     *
     * @param threadPoolName  线程池名称
     * @param corePoolSize    核心线程数
     * @param maximumPoolSize 最大线程数
     * @param queueSize       阻塞队列
     * @return 线程池
     */
    public static ExecutorService getExecutorService(String threadPoolName, int corePoolSize, int maximumPoolSize, int queueSize) {
        if (executorService == null) {
            synchronized (ThreadPoolUtil.class) {
                if (executorService == null) {
                    ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat(threadPoolName + "-%d").build();
                    executorService = new ThreadPoolExecutor(corePoolSize,
                            maximumPoolSize,
                            0L,
                            TimeUnit.MICROSECONDS,
                            new LinkedBlockingQueue<>(queueSize),
                            threadFactory,
                            new ThreadPoolExecutor.AbortPolicy());
                }
            }
        }
        return executorService;
    }
}
