package pers.zjh.data_structure.hashmap;

import lombok.Data;

import java.util.List;

/**
 * 订单
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/14 10:28:27
 */
@Data
public class Order {

    private Long id;

    private String name;

    private List<OrderItem> orderItemList;
}
