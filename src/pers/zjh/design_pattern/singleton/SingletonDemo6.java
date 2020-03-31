package pers.zjh.design_pattern.singleton;

/**
 * 单例模式 - 枚举 - 线程安全 - 最佳方法 - 涉及到反序列创建对象时推荐使用
 *
 * 防止反射构造对象，保证线程安全
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 15:44:22
 */
public enum SingletonDemo6 {
    INSTANCE;
}
