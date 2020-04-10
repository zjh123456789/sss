package pers.zjh.data_structure.hashmap;


import java.util.HashMap;

/**
 * hashMap 测试死循环
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 15:18:31
 */
public class HashMapTest {

    public static void main(String[] args) {

//        // 测试 HashMap 在多线程下发生死循环的场景
//        HashMapThread thread0 = new HashMapThread();
//        HashMapThread thread1 = new HashMapThread();
//        HashMapThread thread2 = new HashMapThread();
//        HashMapThread thread3 = new HashMapThread();
//        HashMapThread thread4 = new HashMapThread();
//        thread0.start();
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();

        // 测试 HashMap key value 可以为空吗
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("孙悟空", "猴子");
        hashMap.put("猪八戒", "猪");
        System.out.println(hashMap.keySet());

        hashMap.put(null, "无名氏");
        System.out.println(hashMap.keySet());

        hashMap.put("无名氏", null);
        System.out.println(hashMap.keySet());
    }
}
