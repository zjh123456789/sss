package pers.zjh.design_pattern.factory;

/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂模式使其创建过程延迟到子类进行
 *
 * 主要解决：主要解决接口选择的问题。
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
 * 关键代码：创建过程在其子类执行。
 *
 * -- 创建型模式 --
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:36
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Factory factory = new CatFactory();
        Animal animal = factory.createAnimal();
        animal.sound();
    }
}
