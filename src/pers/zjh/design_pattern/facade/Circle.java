package pers.zjh.design_pattern.facade;

/**
 * 圆形
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/6/11 19:06
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
