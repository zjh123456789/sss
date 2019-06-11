package pers.zjh.design_pattern.facade;

/**
 * 测试用例Demo
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/6/11 19:10
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        // 单独画圆
        shapeMaker.drawCircle();

        // 单独画长方形
        shapeMaker.drawRectangle();

        // 单独画正方形
        shapeMaker.drawSquare();

        // 画全部图形
        shapeMaker.drawAll();
    }
}
