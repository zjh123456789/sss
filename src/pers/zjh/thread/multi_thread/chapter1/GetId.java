package pers.zjh.thread.multi_thread.chapter1;

/**
 * getId() - 取得线程唯一标识
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 13:23:54
 */
public class GetId {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
