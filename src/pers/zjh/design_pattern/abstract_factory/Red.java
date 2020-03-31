package pers.zjh.design_pattern.abstract_factory;

/**
 * 红色 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/31 14:46:58
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("使用红色填充");
    }
}
