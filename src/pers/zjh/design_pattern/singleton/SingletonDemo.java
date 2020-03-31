package pers.zjh.design_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建
 * 关键代码：构造函数是私有的。
 *
 * -- 创建型模式 --
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/30 14:42:23
 */
public class SingletonDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("------利用反射打破单例------");

        // 获得构造器
        Constructor con = SingletonDemo5.class.getDeclaredConstructor();
        // 设置为可访问
        con.setAccessible(true);
        // 构造两个不同的对象
        SingletonDemo5 singletonDemo55 = (SingletonDemo5) con.newInstance();
        SingletonDemo5 singletonDemo66 = (SingletonDemo5) con.newInstance();

        // 验证是否是不同的对象
        System.out.println(singletonDemo55.equals(singletonDemo66));
    }
}
