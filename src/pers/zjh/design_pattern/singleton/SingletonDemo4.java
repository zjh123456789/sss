package pers.zjh.design_pattern.singleton;

/**
 * 单例模式 - 双重校验锁(double-checked locking) - 线程安全 - 特殊需求可考虑使用
 *
 * 双锁机制，安全且在多线程下能保持高性能
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 15:18:04
 */
public class SingletonDemo4 {

    // 私有构造函数
    private SingletonDemo4() {}

    // 单例对象  volatile -> 避免 JVM 编译器指令重排序
    private volatile static SingletonDemo4 instance = null;

    // 静态工厂方法
    public static SingletonDemo4 getInstance() {
        // 双重检测机制
        if (null == instance) {
            // 同步锁
            synchronized (SingletonDemo4.class) {
                // 双重检测机制
                if (null == instance) {
                    instance = new SingletonDemo4();
                }
            }
        }
        return instance;
    }

}
