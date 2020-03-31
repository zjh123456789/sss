package pers.zjh.design_pattern.singleton;

/**
 * 单例模式 - 静态内部类 - 线程安全 - 明确 lazy 加载时使用
 *
 * 优点：lazy 初始化
 * 对比饿汉式更为合理，没有在 SingletionDemo5 类加载的时候就初始化，显式调用 getInstance() 才装载 SingletionHolder, 从而实例化 instance
 *
 * 缺点：无法防止反射来重复构建对象
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 15:34:36
 */
public class SingletonDemo5 {

    // 私有构造函数
    private SingletonDemo5() {}

    // 静态内部类
    private static class SingletonHolder {
        private static final SingletonDemo5 INSTANCE = new SingletonDemo5();
    }

    // 静态工厂方法
    public static SingletonDemo5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
