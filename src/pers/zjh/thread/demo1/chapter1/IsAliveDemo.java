package pers.zjh.thread.demo1.chapter1;

/**
 * @description: isAlive() 方法：判断当前线程是否处于活动状态
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-31 16:46
 */
public class IsAliveDemo extends Thread {

    @Override
    public void run() {
        System.out.println("run == " + this.isAlive());
    }
}
