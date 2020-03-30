package pers.zjh.design_pattern.template;

/**
 * 模板模式：一个抽象类公开定义了执行它的方法的模式。它的子类可以按照需要重写方法实现，但调用将以抽象类中
 * 定义的方式进行。
 *
 * --行为型模式--
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
