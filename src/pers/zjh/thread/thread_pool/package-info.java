/**
 * @description: 线程池学习
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-23 11:30
 */
package pers.zjh.thread.thread_pool;


/**
 * 通过 Executors 的方法创建出来的线程池都实现了 ExecutorsService 接口。
 * <p>
 * 常用方法有：
 * 1、newFixedThreadPool(int Threads): 创建固定数目的线程池
 * 2、newSingleThreadPoolExecutor(): 创建一个单线程化的 Executor
 * 3、newCacheThreadPool(): 创建一个可缓存的线程池，调用 executor 将重用以前构成的线程（如果线程可用）
 * 如果没有可用的线程，则创建一个新线程并添加到池中。终止并从缓存中移出那些已有60秒钟未被使用的线程。
 * 4、newScheduledThreadPool(int corePoolSize)： 创建一个支持定时及周期性的任务执行的线程。
 * 多数情况下可用来替代 Time 类。
 * <p>
 * <p>
 * 线程池七大参数：
 * 1、corePoolSize 核心线程池大小
 * 2、maximumPoolSize 线程池最大容量大小
 * 3、keepAliveTime 线程池空闲时, 线程存活的时间
 * 4、TimeUnit 时间单位
 * 5、ThreadFactory 线程工厂
 * 6、BlockingQueue 任务队列
 * 7、RejectedExecutionHandler 线程拒绝策略
 */