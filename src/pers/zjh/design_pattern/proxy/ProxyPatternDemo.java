package pers.zjh.design_pattern.proxy;

/**
 * 代理模式：一个类代表另一个类的功能
 *
 * -- 结构型模式 --
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/27 18:39
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_1mb.jpg");

        // 图像从磁盘加载
        image.display();
        System.out.println(" ");
        // 图像不需要从磁盘加载
        image.display();
    }
}
