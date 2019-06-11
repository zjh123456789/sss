package pers.zjh.design_pattern.facade;

/**
 * 外观类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/6/11 19:06
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Recangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawAll(){
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
