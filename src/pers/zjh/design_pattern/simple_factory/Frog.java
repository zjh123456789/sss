package pers.zjh.design_pattern.simple_factory;

/**
 * 青蛙 - 具体产品角色
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/14 17:21
 */
public class Frog implements Animal {

    @Override
    public void sound() {
        System.out.println("青蛙的叫声: '呱呱呱'");
    }

}
