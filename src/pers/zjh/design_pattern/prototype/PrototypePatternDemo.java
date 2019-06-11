package pers.zjh.design_pattern.prototype;

/**
 * 原型模式，用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/29 16:16
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape3.getType());
    }
}
