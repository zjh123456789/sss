package pers.zjh.design_pattern.strategy;

/**
 * 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，
 * 此模式让算法的变化，不会影响到使用算法的客户。
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
