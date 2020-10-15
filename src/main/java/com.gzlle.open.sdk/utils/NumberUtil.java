package com.gzlle.open.sdk.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtil {


  //验证是否为金额
    public static boolean isNumber(String str) {
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){2})?$"); // 判断小数点后2位的数字的正则表达式
        Matcher match = pattern.matcher(str);
        return match.matches();


    }


}