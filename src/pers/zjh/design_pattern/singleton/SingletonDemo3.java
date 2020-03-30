package pers.zjh.design_pattern.singleton;

/**
 * 单例模式 - 懒汉式（加锁） - 线程安全 - 不推荐使用
 *
 * 优点：第一次调用时才初始化，避免浪费内存
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 15:10:38
 */
public class SingletonDemo3 {

    // 私有构造函数
    private SingletonDemo3() {}

    // 单例对象
    private static SingletonDemo3 instance = null;

    // 静态工厂方法
    public synchronized static SingletonDemo3 getInstance() {
        if (null == instance) {
            instance =  new SingletonDemo3();
        }
        return instance;
    }

}
