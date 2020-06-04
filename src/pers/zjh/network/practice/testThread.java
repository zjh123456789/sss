package pers.zjh.network.practice;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 练手
 *
 * @author jinghui.zhu
 * @createTime 2020/3/24 22:11
 */
public class testThread {

    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Lock lock = new ReentrantLock();    // 注意此处

    public static void main(String[] args) {
        final testThread testThread = new testThread();

        new Thread() {
            public void run() {
                testThread.insert(Thread.currentThread());
            };
        }.start();

        new Thread() {
            public void run() {
                testThread.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<5;i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
