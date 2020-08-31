package pers.zjh.object;

import java.util.ArrayList;
import java.util.List;

/**
 * string 测试方法
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/7/27 17:09:47
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "1,2,3";
        String[] split = s.split(",");

        List<Long> list = new ArrayList<>();
        for (String a :
                split) {
            list.add(Long.valueOf(a));
        }
        System.out.println(list);
    }
}
