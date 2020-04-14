package pers.zjh.data_structure.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * list 通过 hashMap 分组
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/14 10:29:53
 */
public class HashMapGroupBy {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        order.setId(1L);
        order.setName("订单1");
        orders.add(order);

        Order order2 = new Order();
        order2.setId(1L);
        order2.setName("订单2");
        orders.add(order2);

        List<OrderItem> orderItems = new ArrayList<>();
        OrderItem orderItem = new OrderItem();
        orderItem.setId(1L);
        orderItem.setOrderId(1L);
        orderItem.setName("订单明细1");

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setId(2L);
        orderItem2.setOrderId(1L);
        orderItem2.setName("订单明细2");

        OrderItem orderItem3 = new OrderItem();
        orderItem3.setId(3L);
        orderItem3.setOrderId(1L);
        orderItem3.setName("订单明细3");

        OrderItem orderItem4 = new OrderItem();
        orderItem4.setId(4L);
        orderItem4.setOrderId(2L);
        orderItem4.setName("订单明细4");

        OrderItem orderItem5 = new OrderItem();
        orderItem5.setId(5L);
        orderItem5.setOrderId(2L);
        orderItem5.setName("订单明细5");

        OrderItem orderItem6 = new OrderItem();
        orderItem6.setId(6L);
        orderItem6.setOrderId(2L);
        orderItem6.setName("订单明细6");

        orderItems.add(orderItem);
        orderItems.add(orderItem2);
        orderItems.add(orderItem3);
        orderItems.add(orderItem4);
        orderItems.add(orderItem5);
        orderItems.add(orderItem6);

        System.out.println("------原订单------");
        System.out.println(orders);
        System.out.println();

        System.out.println("------原订单明细------");
        System.out.println(orderItems);
        System.out.println();

        // 1. 先把订单明细分组 依据所属订单id
        Map<Long, List<OrderItem>> map = orderItems.stream().collect(
                Collectors.groupingBy(OrderItem::getOrderId)
        );

        System.out.println("--------开始循环打印map---------");
        for (Long key : map.keySet()) {
            System.out.println("key(订单id): " + key + "; value(订单明细集合): " + map.get(key));
        }
        System.out.println();

        // 2. 把订单明细集合塞到订单里
        for (Order o : orders) {
            o.setOrderItemList(map.get(o.getId()));
        }

        System.out.println("--------打印订单---------");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
