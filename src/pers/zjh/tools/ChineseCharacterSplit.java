package pers.zjh.tools;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * {todo}
 *
 * @author 朱景辉
 * @createTime 2020/6/11 20:55
 */
public class ChineseCharacterSplit {

    private static String charFa = "汉字";
    private static String hanZi = "汉字";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
        int bufferSize = 20 * 1024 * 1024;// 设读取文件的缓存为20MB
        // 建立缓冲文本输入流
        File file = new File("D:/拆分字库文档.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                fileInputStream);
        InputStreamReader inputStreamReader = new InputStreamReader(
                bufferedInputStream,"UTF-8");
        BufferedReader input = new BufferedReader(inputStreamReader, bufferSize);
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        int splitNum = 112 - 1;// 要分割的块数减一
        int fileLines = 23669283;// 输入文件的行数
        long perSplitLines = fileLines / splitNum;// 每个块的行数
        while(true){
            System.out.println("请输入拆分的汉字？");
            String key  = br.readLine();
            key = new String(key.getBytes("utf-8"),"utf-8");
            for (int i = 0; i <= splitNum; ++i) {
                //  分割    每个块建立一个输出
                String line = null;
                // 逐行读取，逐行输出
                for (long lineCounter = 0; lineCounter < perSplitLines
                        && (line = input.readLine()) != null; ++lineCounter) {
                    String tempStr = line + "\r";
                    String regExp = "\r";
                    Pattern pattern = Pattern.compile(regExp);
                    String[] mobiles = pattern.split(tempStr);
                    if (null != mobiles && mobiles.length > 0) {
                        if (null != mobiles[0] && !"".equals(mobiles[0])) {
                            String content = mobiles[0].substring(1);
                            if (null!=content&&!"".equals(content)) {
                                // 从内容上截取路径数组
                                List<String> list = extractMessage(content);
                                if (null != list && list.size() > 0) {
                                    map.put(mobiles[0].substring(0, 1), list);
                                }
                            }
                        }
                    }
                }
            }
            if (null!=key&&!"".equals(key)) {
                StringBuilder sb = new StringBuilder();
                char[] arr =key.toCharArray();
                if(arr.length>=1){
                    sb.append(hanZi+"："+key+"             ");
                    for (int k=0;k<arr.length;k++) {
                        List<String> valueList = map.get(String.valueOf(arr[k]));
                        if(null!=valueList&&valueList.size()>0){
                            sb.append("【"+charFa+(k+1)+"】"+"：");
                            for (String string : valueList) {
                                sb.append(string+"       ");
                            }
                        }else{
                            sb.append(charFa+"："+key+"  ");
                            break;
                        }
                    }
                }
                System.out.println(sb.toString());
            }else{
                continue;
            }
        }
    }

    /**
     * 提取中括号中内容，忽略中括号中的中括号
     * @param msg
     * @return
     */
    public static List<String> extractMessage(String msg) {

        List<String> list = new ArrayList<String>();
        int start = 0;
        int startFlag = 0;
        int endFlag = 0;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '〖') {
                startFlag++;
                if (startFlag == endFlag + 1) {
                    start = i;
                }
            } else if (msg.charAt(i) == '〗') {
                endFlag++;
                if (endFlag == startFlag) {
                    list.add(msg.substring(start + 1, i));
                }
            }
        }
        return list;
    }
}
