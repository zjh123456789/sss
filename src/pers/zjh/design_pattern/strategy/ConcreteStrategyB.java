package pers.zjh.design_pattern.strategy;

/**
 * 具体算法B
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/17 14:15
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void useStrategy() {
        System.out.println("计策B：水攻");
    }
}
