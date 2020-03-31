package pers.zjh.design_pattern.factory;

/**
 * 动物工厂接口 - 抽象工厂角色 -工厂方法模式的核心，是具体工厂角色必须实现的接口或者必须继承的父类，在java中用抽象类或者接口来实现
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:33
 */
public interface Factory {
    Animal createAnimal();
}
