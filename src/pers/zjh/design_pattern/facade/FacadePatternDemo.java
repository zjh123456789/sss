package pers.zjh.design_pattern.facade;

/**
 * 外观模式：隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 *
 * -- 结构型模式 --
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
