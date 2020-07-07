package pers.zjh.thread.multi_thread.chapter1;

import lombok.Data;

/**
 * 使用 stop() 释放锁将会给数据造成不一致性的结果
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/7 17:16:13
 */
public class Stop3 {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread16 myThread16 = new MyThread16(object);
            myThread16.start();
            Thread.sleep(500);
            myThread16.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

@Data
class SynchronizedObject {
    private String username = "a";
    private String password = "aa";
    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread16 extends Thread {
    private SynchronizedObject object;

    public MyThread16(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
