package pers.zjh.thread.multi_thread.chapter2;

/**
 * 多个线程共同访问 1 个对象中的实例变量，则有可能出现 "非线程安全" 问题
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/11 17:26:08
 */
public class ThreadNotSafe {
    public static void main(String[] args) {
        HasSelfPrivateNum2 numRef2 = new HasSelfPrivateNum2();
        ThreadAA threadA = new ThreadAA(numRef2);
        threadA.start();
        ThreadBB threadB = new ThreadBB(numRef2);
        threadB.start();
    }
}

class HasSelfPrivateNum2 {
    private int num = 0;
    public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadAA extends Thread {
    private HasSelfPrivateNum2 numRef;
    public ThreadAA(HasSelfPrivateNum2 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

class ThreadBB extends Thread {
    private HasSelfPrivateNum2 numRef;
    public ThreadBB(HasSelfPrivateNum2 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
