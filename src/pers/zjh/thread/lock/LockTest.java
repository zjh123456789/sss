package pers.zjh.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 对比 lock() 和 lockInterruptibly()
 *
 * @author 朱景辉
 * @createTime 2020/4/19 8:54
 */
public class LockTest {

    private Lock lock = new ReentrantLock();

    public void doBusiness() {

        String name = Thread.currentThread().getName();

        try {
            System.out.println(name + " 开始获取锁");
            lock.lock();
            // lock.lockInterruptibly();
            System.out.println(name + " 得到锁");
            System.out.println(name + " 开工干活");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(name + " : " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " 被中断");
            System.out.println(name + " 做些别的事情");
        } finally {
            try {
                lock.unlock();
                System.out.println(name + " 释放锁");
            } catch (Exception e) {
                System.out.println(name + " : 没有得到锁的线程运行结束");
            }
        }

    }
}
