package pers.zjh.design_pattern.abstract_factory;

/**
 * 绿色 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:48:26
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("使用绿色填充");
    }
}
