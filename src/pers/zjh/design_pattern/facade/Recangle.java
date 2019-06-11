package pers.zjh.design_pattern.facade;

/**
 * 长方形
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/6/11 19:04
 */
public class Recangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
