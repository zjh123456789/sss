package pers.zjh.design_pattern.simple_factory;

/**
 * 猫 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/14 17:20
 */
public class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("猫的叫声: '喵喵喵'");
    }

}
