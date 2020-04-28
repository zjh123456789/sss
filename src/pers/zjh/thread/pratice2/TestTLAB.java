package pers.zjh.thread.pratice2;

/**
 * 指令重排序
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/28 17:53:13
 */
public class TestTLAB {

    private static int a = 0, b = 0;
    private static int x = 0, y = 0;

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        for (;;) {
            i ++;
            a = 0; b = 0;
            x = 0; y = 0;
            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    // 由于线程 one 先启动, 下面这句话让它等一等线程 other.
                    shortWait(100000);
                    a = 1;
                    x = b;
                }
            });

            Thread other = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = a;
                }
            });

            one.start();
            other.start();
            one.join();
            other.join();

            String result = "第" + i + "次 (" + x + "," + y + ")";

            if (x == 0 && y == 0) {
                System.err.println(result);
                break;
            } else {
                System.out.println(result);
            }
        }
    }

    public static void shortWait(long interVal) {
        long start = System.nanoTime();
        long end;
        do {
            end = System.nanoTime();
        } while (start + interVal >= end);
    }

}
