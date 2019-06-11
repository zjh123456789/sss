package pers.zjh.design_pattern.template;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 17:20
 */
public class DNF extends Game {

    @Override
    void initialize() {
        System.out.println("准备! DNF 游戏初始化中");
    }

    @Override
    void startPlay() {
        System.out.println("开始玩DNF啦! Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("时间到! DNF 游戏结束!");
    }
}
