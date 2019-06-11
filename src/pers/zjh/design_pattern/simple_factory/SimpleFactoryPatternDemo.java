package pers.zjh.design_pattern.simple_factory;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/14 17:27
 */
public class SimpleFactoryPatternDemo {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        // 获取 “狗” 对象，并调用它的 sound 方法
        Animal animal1 = animalFactory.createAnimal("Dog");
        animal1.sound();

        // 获取 “猫” 对象，并调用它的 sound 方法
        Animal animal2 = animalFactory.createAnimal("Cat");
        animal2.sound();

        // 获取 “青蛙” 对象，并调用它的 sound 方法
        Animal animal3 = animalFactory.createAnimal("Frog");
        animal3.sound();
    }


}
