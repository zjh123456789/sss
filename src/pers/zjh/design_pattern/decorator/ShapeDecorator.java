package pers.zjh.design_pattern.decorator;

/**
 * 实现了 Shape 接口的抽象装饰类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/23 19:08
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
