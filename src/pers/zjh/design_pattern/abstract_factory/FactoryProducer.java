package pers.zjh.design_pattern.abstract_factory;

/**
 * 工厂创造类 - 通过传递形状或颜色信息来获取工厂
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:57:03
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if ("shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
