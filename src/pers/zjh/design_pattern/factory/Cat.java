package pers.zjh.design_pattern.factory;

/**
 * 猫 - 具体工厂角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:31
 */
public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("猫的叫声: '喵喵喵'");
    }

}
