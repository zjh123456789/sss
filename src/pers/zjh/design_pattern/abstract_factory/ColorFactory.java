package pers.zjh.design_pattern.abstract_factory;

/**
 * 具体产品工厂 - 生成具体产品
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:55:04
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (null == color) {
            return null;
        }
        if ("red".equals(color)) {
            return new Red();
        } else if ("green".equals(color)) {
            return new Green();
        } else if ("blue".equals(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
