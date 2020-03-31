package pers.zjh.design_pattern.abstract_factory;

/**
 * 抽象工厂 - 获取抽象产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:50:15
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
