package pers.zjh.algorithm.leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * {todo}
 *
 * @author 朱景辉
 * @createTime 2021/6/7 8:25
 */
public class AA {

    Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();

    volatile int value = 0;

    public int count;

    public AA(int count) {
        this.count = count;
    }

    public void printABC() {
        new Thread(new ThreadA()).start();
        new Thread(new ThreadB()).start();
        new Thread(new ThreadC()).start();
    }

    class ThreadA extends Thread {
        @Override
        public void run() {
            lock.lock();
            try {
                for(int i = 0; i < count; i++) {
                    while(value % 3 != 0) {
                        conditionA.await();
                    }
                    System.out.print("A");
                    conditionB.signal();
                    value++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    class ThreadB extends Thread {
        @Override
        public void run() {
            lock.lock();
            try {
                for(int i = 0; i < count; i++) {
                    while(value % 3 != 1) {
                        conditionB.await();
                    }
                    System.out.print("B");
                    conditionC.signal();
                    value++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    class ThreadC extends Thread {
        @Override
        public void run() {
            lock.lock();
            try {
                for(int i = 0; i < count; i++) {
                    while(value % 3 != 2) {
                        conditionC.await();
                    }
                    System.out.print("C");
                    conditionA.signal();
                    value++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        AA printABC = new AA(3);
        printABC.printABC();
    }
}