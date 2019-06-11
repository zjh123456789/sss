package pers.zjh.design_pattern.factory;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:35
 */
public class DogFactory implements Factory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
