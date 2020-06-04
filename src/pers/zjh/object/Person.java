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
        Person a = null;
        setProperty(a);
        System.out.println(a);
    }

    private static void setProperty(Person person) {
        person = new Person();
        person.setName("张楚岚");
        person.setAge(20);
    }
}

