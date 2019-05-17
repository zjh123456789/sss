package pers.design_pattern.strategy;

/**
 * 具体算法C
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/17 14:20
 */
public class ConcreteStrategyC implements Strategy {

    @Override
    public void useStrategy() {
        System.out.println("计策C：人海战术");
    }
}
