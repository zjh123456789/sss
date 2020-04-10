package pers.zjh.data_structure.hashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap 测试类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/10 09:15:57
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        System.out.println("===测试 ConcurrentHashMap key value 是否可以为空====");
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("孙悟空", "猴子");
        concurrentHashMap.put("猪八戒", "猪");
        System.out.println(concurrentHashMap.keySet());

        concurrentHashMap.put(null, "无名氏");
        System.out.println(concurrentHashMap.keySet());

        concurrentHashMap.put("无名氏", null);
        System.out.println(concurrentHashMap.keySet());
    }
}
