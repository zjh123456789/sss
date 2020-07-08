package pers.zjh.thread.multi_thread.chapter1;

/**
 * yield() - 放弃当前 CPU 资源，将它让给其他的任务去占用 CPU 执行时间。
 * 但放弃的时间不确定，有可能刚刚放弃，马上又获得 CPU 时间片
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/8 08:52:14
 */
public class Yield {
    public static void main(String[] args) {
        MyThread18 myThread18 = new MyThread18();
        myThread18.start();
    }
}

class MyThread18 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" 用时： " + (endTime - beginTime) + "毫秒！ ");
    }
}
