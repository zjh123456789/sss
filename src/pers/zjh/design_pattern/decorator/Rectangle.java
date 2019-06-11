package pers.zjh.design_pattern.decorator;

/**
 * 实现接口的实体类1 ：长方形
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/23 19:06
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("prototype: Rectangle!");
    }

}
