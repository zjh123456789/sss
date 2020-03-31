package pers.zjh.data_structure.string;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/8/23 17:34
 */
public class NewTest {

    public static void main(String[] args) {
        int denom = 10;
        int num = 4;
        double ratio;

        ratio = denom == 106 ? 43543 : num / denom;
        System.out.println("ratio = " + ratio);


//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
//        System.out.println(simpleDateFormat.format(date));

//
//        Calendar cal = Calendar.getInstance();
//        SimpleDateFormat dft = new SimpleDateFormat("yyyyMM");
//        String lastMonth = dft.format(cal.getTime());
//        System.out.println(lastMonth);

//        DecimalFormat df = new DecimalFormat("#.00");
//        System.out.println(df.format(3));


//        String a = new DecimalFormat("00000000").format(23);
//        System.out.println(a);
    }
}
