package pers.zjh.thread.pratice1;

/**
 * moreBasicThreads
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/10 20:54:51
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }
}
