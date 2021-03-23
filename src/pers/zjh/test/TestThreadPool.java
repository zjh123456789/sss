package pers.zjh.test;

import pers.zjh.tools.ThreadPoolUtil;

import java.util.concurrent.ExecutorService;

/**
 * @description: 测试线程池的使用
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-23 16:32
 */
public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = ThreadPoolUtil.getExecutorService("charge-control", 10, 20, 50);


        System.out.println("main 线程启动打印" + Thread.currentThread().getName());

        executorService.execute(() -> {
            System.out.println(" 线程池打印" + Thread.currentThread().getName());
        });

    }

}
