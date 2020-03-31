package pers.zjh.design_pattern.factory;

/**
 * 狗 - 具体工厂角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:32
 */
public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("狗的叫声: '汪汪汪'");
    }

}
