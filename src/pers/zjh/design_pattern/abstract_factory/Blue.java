package pers.zjh.design_pattern.abstract_factory;

/**
 * 蓝色 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:49:07
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("使用蓝色填充");
    }
}
