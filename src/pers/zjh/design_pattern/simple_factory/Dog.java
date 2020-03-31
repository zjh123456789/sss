package pers.zjh.design_pattern.simple_factory;

/**
 * 狗 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/14 17:18
 */
public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("狗的叫声: '汪汪汪'");
    }

}
