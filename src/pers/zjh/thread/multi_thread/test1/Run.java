package pers.zjh.thread.multi_thread.test1;

/**
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/6 18:00:50
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束! ");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
