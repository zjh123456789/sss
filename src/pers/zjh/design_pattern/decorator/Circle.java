package pers.zjh.design_pattern.decorator;

/**
 * 实现接口的实体类2：圆形
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/23 19:07
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle!");
    }
}
