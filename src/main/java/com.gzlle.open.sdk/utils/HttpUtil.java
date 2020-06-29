package com.gzlle.open.sdk.utils;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;

public class HttpUtil {

    public static String doPost(String url, Map<String, Object> map, String charset, LinkedHashMap<String, String> headers) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try {
            httpClient = HttpClients.createDefault();
            httpPost = new HttpPost(url);
            Gson gson = new Gson();
            //转换成json字符串
            String jsonString = gson.toJson(map);
            //设置编码格式防止出现中文乱码
            StringEntity stringEntity = new StringEntity(jsonString, Charset.forName("UTF-8"));
            //给HttpPost 设置请求头
            if (headers != null) {
                for (String key : headers.keySet()) {
                    httpPost.setHeader(key, headers.get(key));
                }
            }
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity resEntity = response.getEntity();
            result = EntityUtils.toString(resEntity, charset);
        } catch (Exception e) {
            System.err.println("调用遭遇异常，原因：");
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }

    public static String doGet(String url, String charset, LinkedHashMap<String, String> headers) {
        CloseableHttpClient httpClient = null;
        HttpGet httpGet = null;
        String result = null;
        try {
            httpClient = HttpClients.createDefault();
            httpGet = new HttpGet(url);

            //设置请求头
            //给HttpPost 设置请求头
            if (headers != null) {
                for (String key : headers.keySet()) {
                    httpGet.setHeader(key, headers.get(key));
                }
            }
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity resEntity = response.getEntity();
            result = EntityUtils.toString(resEntity, charset);
        } catch (Exception e) {
            System.err.println("调用遭遇异常，原因：");
            throw new RuntimeException(e.getMessage());
        }
        return result;

    }

    /*public static String httpPostRequest2(String token,MultipartFile multipartFile, String fileParName,
                                          ImportOrderDTO importOrderDTO) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = "";
        try {
            HttpPost httpPost = new HttpPost(baseUrlUtil.API_BASE_URL + "/orders/batch/import/history");
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setCharset(Charset.forName("UTF-8"));
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            String fileName = multipartFile.getOriginalFilename();
            builder.addBinaryBody(fileParName, multipartFile.getInputStream(), ContentType.MULTIPART_FORM_DATA, fileName);
            //解决中文乱码
            ContentType contentType = ContentType.create("text/plain", "UTF-8");
            SortedMap<String, Object> params = BeanToMapUtil.beanToMap(importOrderDTO);
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                builder.addTextBody(entry.getKey(), entry.getValue().toString(), contentType);
            }

            HttpEntity entity = builder.build();
            httpPost.setHeader("Authorization", token);
            httpPost.setEntity(entity);
            HttpResponse response = httpClient.execute(httpPost);// 执行提交
            HttpEntity resEntity = response.getEntity();
            result = EntityUtils.toString(resEntity, "UTF-8");
        } catch (Exception e) {
            System.err.println("调用遭遇异常，原因：");
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }*/

    public static void main(String[] args) {
        LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json; charset=UTF-8");
        String charset = "UTF-8";
        String result = HttpUtil.doGet("https://www.baidu.com/", charset, headers);
        System.out.println(result);
    }
}
