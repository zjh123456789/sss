package pers.zjh.pratice.stringtest;

import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * string 测试类
 * Created by jinghui.zhu on 2018/10/30
 */
public class NewStringTest {
    public static void main(String[] args) {
//        long id=1001;
//        StringBuffer sb = new StringBuffer();
//        sb.append(LongToFixLengthString(id));
//        //sb.append(" ");
//        SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmm");
//        sb.append(df.format(new Date()));
//        //sb.append(" ");
//        Random random = new Random();
//        sb.append(random.nextInt(90)+10);
//        System.out.println(sb.toString());

        System.out.println(LongToFixLengthString(23233));
    }

    public static String LongToFixLengthString(long id) {
        NumberFormat formatter = new DecimalFormat("00000000");
        return formatter.format(id);
    }
}
