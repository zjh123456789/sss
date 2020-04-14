package pers.zjh.data_structure.hashmap;

import lombok.Data;

/**
 * 订单明细
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/4/14 10:28:45
 */
@Data
public class OrderItem {

    private Long id;

    private Long orderId;

    private String name;
}
