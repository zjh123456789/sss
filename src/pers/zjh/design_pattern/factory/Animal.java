package pers.zjh.design_pattern.factory;

/**
 * 接口 - 抽象产品角色 - 具体产品继承的父类或者是实现的接口，一般由抽象类或接口来实现
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 14:31
 */
public abstract class Animal {

    /**
     * 动物名称
     */
    private String name;

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
