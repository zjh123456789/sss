package pers.zjh.data_structure.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 创建 hashMap 的线程类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 15:19:51
 */
public class HashMapThread extends Thread {
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Map<Integer, Integer> map = new HashMap<>();

    @Override
    public void run() {
        while (atomicInteger.get() < 1000000) {
            map.put(atomicInteger.get(), atomicInteger.get());
            atomicInteger.incrementAndGet();
            System.out.println(atomicInteger.get());
        }
    }
}
