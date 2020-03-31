package pers.zjh.design_pattern.abstract_factory;

/**
 * 具体产品工厂 - 生成具体产品
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:51:41
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (null == shape) {
            return null;
        }
        if ("circle".equals(shape)) {
            return new Circle();
        } else if ("rectangle".equals(shape)) {
            return new Rectangle();
        } else if ("square".equals(shape)) {
            return new Square();
        }
        return null;
    }
}
