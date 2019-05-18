package pers.zjh.design_pattern.strategy;

/**
 * Context 类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/17 14:23
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.useStrategy();
    }
}
