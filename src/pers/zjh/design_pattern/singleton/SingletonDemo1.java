package pers.zjh.design_pattern.singleton;

/**
 * 单例模式 - 饿汉式 - 线程安全 - 推荐使用
 *
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，浪费内存，instance 在类装载时就初始化
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 14:49:03
 */
public class SingletonDemo1 {

    // 私有构造函数
    private SingletonDemo1() {}

    // 单例对象
    private static SingletonDemo1 instance = new SingletonDemo1();

    // 静态工厂方法
    public static SingletonDemo1 getInstance() {
        return instance;
    }

}
