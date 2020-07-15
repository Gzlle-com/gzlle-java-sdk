package com.gzlle.open.sdk.utils;


import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CallbackUtil {

    //从request的json字符串中parse出对象
    public static <T> T parseObject(HttpServletRequest request, Class<T> type) {
        T param = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder stringBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = bufferedReader.readLine()) != null) {
                stringBuilder.append(inputStr);
            }
            Gson gson = new Gson();
            gson.fromJson(stringBuilder.toString(),type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return param;

    }


}
