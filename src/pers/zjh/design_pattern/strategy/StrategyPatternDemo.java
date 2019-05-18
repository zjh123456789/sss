package pers.zjh.design_pattern.strategy;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/17 14:27
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context contextA = new Context(new ConcreteStrategyA());
        contextA.executeStrategy();

        Context contextB = new Context(new ConcreteStrategyB());
        contextB.executeStrategy();

        Context contextC = new Context(new ConcreteStrategyC());
        contextC.executeStrategy();
    }
}
