package pers.zjh.object;

import lombok.Data;

/**
 * Person 类
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/6/4 11:11:05
 */
@Data
public class Person {

    /**
     * 主键id
     */
    private int id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public static void main(String[] args) {
        Person a = new Person();
        a.setName("风");
        a.setAge(90);
        a.setId(999);
        System.out.println(a);
        setProperty(a);
        System.out.println(a);

        Person b = null;
        System.out.println(b);
        setProperty(b);
        System.out.println(b);
    }

    private static void setProperty(Person person) {
        person.setName("张楚岚");
        person.setAge(20);
    }
}

