package pers.zjh.design_pattern.strategy;

/**
 * 策略模式：一个类的行为或其算法可以在运行时更改
 *
 * -- 行为型模式 --
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
