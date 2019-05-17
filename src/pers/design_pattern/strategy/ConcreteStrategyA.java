package pers.design_pattern.strategy;

/**
 * 具体算法A
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/17 14:08
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void useStrategy() {
        System.out.println("计策A：使用火攻!!");
    }
}
