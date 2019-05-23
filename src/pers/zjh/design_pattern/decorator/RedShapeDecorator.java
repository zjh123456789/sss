package pers.zjh.design_pattern.decorator;

/**
 * 扩展了ShapeDecorator类的实体装饰类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/23 19:11
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
