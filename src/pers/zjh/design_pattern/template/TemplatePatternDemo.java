package pers.zjh.design_pattern.template;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 17:22
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new DNF();
        game.play();
        System.out.println("--------------------");
        Game game1 = new LOL();
        game1.play();

    }
}
