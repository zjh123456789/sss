package pers.zjh.design_pattern.facade;

/**
 * 正方形
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/6/11 19:05
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
