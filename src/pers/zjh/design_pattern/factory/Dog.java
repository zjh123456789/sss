package pers.zjh.design_pattern.factory;

/**
 * ${todo}
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
