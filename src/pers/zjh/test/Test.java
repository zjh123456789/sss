package pers.zjh.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: jinghui.zhu@luckincoffee.com
 * @date: 2021-03-24 10:56
 */
public class Test {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        StringBuffer stringBuffer = new StringBuffer();
        for (String s : a) {
            stringBuffer.append(s).append(",");
        }

        System.out.println(stringBuffer);

        System.out.println(stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString());
    }
}
