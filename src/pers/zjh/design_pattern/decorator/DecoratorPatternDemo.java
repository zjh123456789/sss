package pers.zjh.design_pattern.decorator;

/**
 * 装饰器模式：允许向一个现有的对象添加新的功能，同时又不改变其结构。
 *
 * -- 结构型模式 --
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/23 19:13
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
/*        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());*/

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
