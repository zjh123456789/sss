package pers.zjh.design_pattern.abstract_factory;

/**
 * 正方形 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:44:43
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
