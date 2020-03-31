package pers.zjh.design_pattern.abstract_factory;

/**
 * 长方形 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:43:21
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}
