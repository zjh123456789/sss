package pers.zjh.lambda;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * lambda 测试用例1
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/23 14:11:30
 */
public class LambdaTest1 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("小明");
        user.setAge(BigDecimal.valueOf(22));
        users.add(user);

        User user1 = new User();
        user1.setName("二明");
        user1.setAge(BigDecimal.valueOf(43));
        users.add(user1);


//        List<String> list = users.stream().map(User::getName).collect(Collectors.toList());
//
//        System.out.println("ssss: " + users.stream().map(User::getAge).reduce(BigDecimal::add).get());
//        System.out.println(list);
//        System.out.println(users);

        String s1 = "s ";
        String s2 = "s";

        System.out.println(s2.length());
        System.out.println(s1.substring(1) + "11");
        System.out.println(s2.substring(1) + "22");

        System.out.println(s2.substring(1).equals(""));

        Map<String, Object> bizData = new HashMap<>(16);
        bizData.putAll(JSON.parseObject(JSON.toJSONString(user, SerializerFeature.WriteMapNullValue)));
        System.out.println(bizData);
    }
}
