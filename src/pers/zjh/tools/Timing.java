package pers.zjh.tools;

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

        System.out.println("上月第一天 " + periodStartTime);

        // 当前时间
        Date now = new Date();
        System.out.println("当前时间: " + now);

        // 昨天 dateTime
        DateTime yesterday = new DateTime(now).minusDays(1);
        System.out.println("昨天 dateTime: " + yesterday);
        // 昨天 date
        Date yesterdayDate = yesterday.toDate();
        System.out.println("昨天 date: " + yesterdayDate);

        long days = now.getTime() - yesterday.toDate().getTime();
        System.out.println("间隔时长: " + days);
        int tian = (int) (days / (1400 * 60 * 60 * 24));
        System.out.println("天数: " + tian);

        System.out.println("一天包含多少秒: " + 24*3600);


        // 查找距离此刻 - 7 天
        DateTime dateTime = new DateTime();
        Date startTime = dateTime.minusDays(7).withTimeAtStartOfDay().toDate();
        Date endTime = dateTime.minusDays(6).withTimeAtStartOfDay().toDate();
        System.out.println("7天前时间: " + startTime + "  6天前时间: " + endTime);


        System.out.println(new Date());
        System.out.println(new Date().toString());

        Date ddd = null;
        System.out.println(ddd);

        System.out.println(new DateTime(ddd));
        System.out.println(new DateTime(new Date()));
        System.out.println(new DateTime(new DateTime(new Date()).plusDays(1).toDate()));
    }

}
