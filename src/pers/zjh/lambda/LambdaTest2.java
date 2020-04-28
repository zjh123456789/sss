package pers.zjh.lambda;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * lambda 测试用例2
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/24 13:44:55
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        Map<String, BigDecimal> map = new HashMap<>();
        map.put("西瓜", BigDecimal.TEN);
        map.put("苹果", BigDecimal.ONE);
        map.forEach((k, v) -> System.out.println("k,,,v,,, = " + k + "v=====" + v));


        Set<String> s = map.keySet();
        for (String str : s) {
            map.put(str, map.get(str).multiply(BigDecimal.valueOf(-1)));
        }

        map.forEach((k, v) -> System.out.println("k,,,v,,, = " + k + "v=====" + v));


        BigDecimal bi = BigDecimal.ONE;
        BigDecimal ci = BigDecimal.TEN;

        System.out.println("bi: " + bi + "  ci: " + ci);

        // 加法
        System.out.println(bi.add(ci));

        // 最小值
        System.out.println(ci.min(bi));

        // 减法
        System.out.println(bi.subtract(ci));
    }
}
