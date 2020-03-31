package pers.zjh.design_pattern.factory;

/**
 * 创建狗的工厂 - 具体工厂角色
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
