package com.gzlle.open.sdk.withdraw;

import com.google.gson.Gson;
import com.gzlle.open.sdk.api.WithdrawCallbackHandler;
import com.gzlle.open.sdk.auth.AuthDemo;
import com.gzlle.open.sdk.dto.withdraw.ListOrderDTO;
import com.gzlle.open.sdk.dto.withdraw.OrderDTO;
import com.gzlle.open.sdk.dto.withdraw.WithdrawCallbackDTO;
import com.gzlle.open.sdk.exceptions.SignException;
import com.gzlle.open.sdk.utils.BaseUrlUtil;
import com.gzlle.open.sdk.utils.BeanToMapUtil;
import com.gzlle.open.sdk.utils.CallbackUtil;
import com.gzlle.open.sdk.utils.HttpUtil;
import com.gzlle.open.sdk.utils.NumberUtil;
import com.gzlle.open.sdk.utils.SignUtil;
import com.gzlle.open.sdk.vo.CallbackVO;
import com.gzlle.open.sdk.vo.token.AccessTokenVO;
import com.gzlle.open.sdk.vo.withdraw.GetOrderVO;
import com.gzlle.open.sdk.vo.withdraw.ListOrderVO;
import com.gzlle.open.sdk.vo.withdraw.OrderVO;
import com.gzlle.open.sdk.vo.withdraw.SelectBalanceVO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.SortedMap;

public class WithdrawDemo {
    /**
     * 添加订单接口
     */
    public static OrderVO addOrder(String token, OrderDTO orderDTO, String appKey) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/add";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(orderDTO);
        //使用32位以类的随机字符串
        paramters.put("nonce", SignUtil.buildNonce(32));
        //sign使用SignUtil工具类生成签名
        String sign = SignUtil.createOpenSign(paramters, appKey);
        paramters.put("sign", sign);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, OrderVO.class);
    }

    //查询单个订单接口
    public static GetOrderVO getOrder(String token, String tradeNo) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/get/" + tradeNo;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, GetOrderVO.class);
    }

    //查询订单列表接口
    public static ListOrderVO listOrder(String token, ListOrderDTO listOrderDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/list";
        //转换为map集合
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(listOrderDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, ListOrderVO.class);
    }

    //查询企业余额
    public static SelectBalanceVO selectBalance(String token, String providerId) {
        String url = BaseUrlUtil.API_BASE_URL + "/account/balance/" + providerId;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        SelectBalanceVO selectBalanceVO=new SelectBalanceVO();
        if (NumberUtil.isNumber(result)){
           selectBalanceVO.setMoney(result);
        }else {
            return new Gson().fromJson(result, SelectBalanceVO.class);
        }
        return selectBalanceVO;
    }

    //处理回调请求
    /*public static void processCallback(HttpServletRequest request, HttpServletResponse response, WithdrawCallbackHandler withdrawCallbackHandler, String appKey) {
        WithdrawCallbackDTO withdrawCallbackDTO = CallbackUtil.parseObject(request, WithdrawCallbackDTO.class);
        //验证签名合法性
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(withdrawCallbackDTO);
        paramters.remove("sign");
        String sign = SignUtil.createOpenSign(paramters, appKey);
        try {
            if (!sign.equals(withdrawCallbackDTO.getSign())) {
                throw new SignException("签名不合法");
            }
        } catch (SignException e) {

        }
        try {
            if (withdrawCallbackHandler != null) {
                withdrawCallbackHandler.processCallback(withdrawCallbackDTO);
            }
        } catch (Exception e) {
            System.err.println("处理回调请求失败");
        }
        response.setContentType("application/json");

        try {
            CallbackVO callbackVO = new CallbackVO();
            callbackVO.setMessage("成功");
            callbackVO.setResponseCode(200);
            Gson gson=new Gson();
            String str = gson.toJson(callbackVO);
            PrintWriter writer = response.getWriter();
            writer.write(str);
        } catch (IOException e) {
            System.err.println("写入回调处理结果失败");
        }


    }*/

    public static void main(String[] args) {
        AccessTokenVO accessToken = AuthDemo.getAccessToken("309005825454637056", "B5DA273A8DB648BF14A7FAFD5AD874CF");
        String token="Bearer "+accessToken.getAccessToken();
        SelectBalanceVO selectBalanceVO = selectBalance(token, "200213842716786688");
        System.out.println(selectBalanceVO.getError());
        System.out.println(selectBalanceVO.getMessage());
        System.out.println(selectBalanceVO.getMoney());

    }

}
