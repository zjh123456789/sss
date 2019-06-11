package pers.zjh.design_pattern.template;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 17:18
 */
public class LOL extends Game {

    @Override
    void initialize() {
        System.out.println("英雄联盟要开始啦! 准备!!!");
    }

    @Override
    void startPlay() {
        System.out.println("开始玩英雄联盟啦,好好享受!");
    }

    @Override
    void endPlay() {
        System.out.println("时间到! 英雄联盟游戏结束!");
    }
}
