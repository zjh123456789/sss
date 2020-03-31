package pers.zjh.design_pattern.abstract_factory;

/**
 * 圆形 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:45:06
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
