package pers.zjh.test;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/3/20 16:47:37
 */
public class Timing {

    public static void main(String[] args) {

        // 上月第一天
        DateTime periodStartTime= new DateTime(new Date()).minusMonths(1).withDayOfMonth(1).withTime(0, 0, 0, 0);
        // 本月第一天
        DateTime periodEndTime = new DateTime(new Date()).withDayOfMonth(1).withTime(0, 0, 0, 0);

        Date date = new DateTime(new Date()).minusMonths(1).toDate();

        System.out.println("ssss");
    }
}
