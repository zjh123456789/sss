package pers.zjh.thread.demo1.chapter1;

/**
 * @description: 运行测试类
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-29 21:58
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
