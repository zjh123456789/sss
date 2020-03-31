package pers.zjh.design_pattern.factory;

/**
 * 创建青蛙的工厂 - 具体工厂角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:35
 */
public class FrogFactory implements Factory {

    @Override
    public Animal createAnimal() {
        return new Frog();
    }

}
