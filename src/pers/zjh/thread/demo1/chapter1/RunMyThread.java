package pers.zjh.thread.demo1.chapter1;

/**
 * @description: 实现 Runnable 接口
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-31 15:58
 */
public class RunMyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("run: " + Thread.currentThread().getName());
    }
}
