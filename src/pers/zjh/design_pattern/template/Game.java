package pers.zjh.design_pattern.template;

/**
 * 抽象类，拥有模板方法
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 17:15
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // 模板
    public final void play(){

        // 初始化游戏
        initialize();

        // 开始游戏
        startPlay();

        // 结束游戏
        endPlay();
    }

}
