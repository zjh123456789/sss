package pers.zjh.design_pattern.factory;

/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * 工厂方法使一个类的实例化延迟到其子类。
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
