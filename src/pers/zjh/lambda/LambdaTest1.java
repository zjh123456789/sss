package pers.zjh.lambda;

import java.util.ArrayList;
import java.util.List;
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
        user.setAge(22);
        users.add(user);

        User user1 = new User();
        user1.setName("二明");
        user1.setAge(43);
        users.add(user1);


        List<String> list = users.stream().map(User::getName).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(users);
    }
}
