package pers.zjh.thread.demo1.chapter1;

/**
 * @description: getId()：取得线程的唯一标识
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-31 18:05
 */
public class GetIdThreadDemo {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread name: " + thread.getName());
        System.out.println("thread id: " + thread.getId());
    }
}
