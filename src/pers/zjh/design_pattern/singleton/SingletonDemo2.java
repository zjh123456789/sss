package pers.zjh.design_pattern.singleton;

/**
 * 单例模式 - 懒汉式 - 线程不安全 - 不推荐使用
 *
 * lazy 初始化
 * 不支持多线程
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 14:52:22
 */
public class SingletonDemo2 {

    // 私有构造函数
    private SingletonDemo2() {}

    //  单例对象
    private static SingletonDemo2 instance = null;

    // 静态工厂方法
    public static SingletonDemo2 getInstance() {
        if (null == instance) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

}
