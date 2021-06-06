package pers.zjh.algorithm.other;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 顺序打印 ABC
 *
 * @author 朱景辉
 * @createTime 2021/6/6 22:57
 */
public class PrintABC {

    Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();

    // 控制变量
    volatile int value = 0;

    // 打印多少次
    private int count;

    public PrintABC(int count) {
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
                for (int i = 0; i < count; i++) {
                    while (value % 3 != 0) {
                        conditionA.await();
                    }
                    System.out.print("A");
                    conditionB.signal();
                    value++;
                }
            } catch (InterruptedException e) {
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
                for (int i = 0; i < count; i++) {
                    while (value % 3 != 1) {
                        conditionB.await();
                    }
                    System.out.print("B");
                    conditionC.signal();
                    value++;
                }
            } catch (InterruptedException e) {
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
                for (int i = 0; i < count; i++) {
                    while (value % 3 != 2) {
                        conditionC.await();
                    }
                    System.out.print("C");
                    conditionA.signal();
                    value++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        PrintABC printABC = new PrintABC(3);
        printABC.printABC();
    }

}

