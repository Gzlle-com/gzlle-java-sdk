package com.gzlle.open.sdk.account;

import com.google.gson.Gson;
import com.gzlle.open.sdk.api.AccountCallbackHandler;
import com.gzlle.open.sdk.auth.AuthDemo;
import com.gzlle.open.sdk.dto.account.AccountCallbackDTO;
import com.gzlle.open.sdk.dto.account.CreateRechargeDTO;
import com.gzlle.open.sdk.dto.account.ListRechargeDTO;
import com.gzlle.open.sdk.exceptions.SignException;
import com.gzlle.open.sdk.utils.BaseUrlUtil;
import com.gzlle.open.sdk.utils.BeanToMapUtil;
import com.gzlle.open.sdk.utils.CallbackUtil;
import com.gzlle.open.sdk.utils.HttpUtil;
import com.gzlle.open.sdk.utils.SignUtil;
import com.gzlle.open.sdk.vo.CallbackVO;
import com.gzlle.open.sdk.vo.account.ListChargeVO;
import com.gzlle.open.sdk.vo.account.RechargeApplicationVO;
import com.gzlle.open.sdk.vo.token.AccessTokenVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.SortedMap;
public class AccountDemo {

    public static RechargeApplicationVO createRecharge(String token, CreateRechargeDTO createRechargeDTO, String appKey) {

        String url = BaseUrlUtil.API_BASE_URL + "/account/prestore/add";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(createRechargeDTO);
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
        return new Gson().fromJson(result, RechargeApplicationVO.class);
    }


    public static RechargeApplicationVO getRecharge(String token, String id) {
        String url = BaseUrlUtil.API_BASE_URL + "/account/prestore/get/" + id;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, RechargeApplicationVO.class);

    }


    public static ListChargeVO ListCharge(String token, ListRechargeDTO listRechargeDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/account/prestore/list";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(listRechargeDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, ListChargeVO.class);
    }


    public static void processCallback(HttpServletRequest request, HttpServletResponse response, AccountCallbackHandler accountCallbackHandler, String appKey) {
        AccountCallbackDTO accountCallbackDTO = CallbackUtil.parseObject(request, AccountCallbackDTO.class);
        //验证签名合法性
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(accountCallbackDTO);
        paramters.remove("sign");
        String sign = SignUtil.createOpenSign(paramters, appKey);
        try {
            if (!sign.equals(accountCallbackDTO.getSign())) {
                throw new SignException("签名不合法");
            }
        } catch (SignException e) {

        }
        try {
            if (accountCallbackHandler!= null) {
                accountCallbackHandler.processCallback(accountCallbackDTO);
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


    }
    public static void main(String[] args) {
        AccessTokenVO accessToken = AuthDemo.getAccessToken("309005825454637056", "B5DA273A8DB648BF14A7FAFD5AD874CF");
        String token="Bearer "+accessToken.getAccessToken();
        CreateRechargeDTO createRechargeDTO=new CreateRechargeDTO();
        createRechargeDTO.setAmount("15.14");
        createRechargeDTO.setBank("支付宝");
        createRechargeDTO.setBankName("陈豪");
        createRechargeDTO.setBankNo("5254151515");
        createRechargeDTO.setPayImg("gyhg");
        createRechargeDTO.setPayType(1);
        createRechargeDTO.setPayTime("2010/3/2");
        RechargeApplicationVO recharge = AccountDemo.createRecharge(token, createRechargeDTO, "309005825454637056");
        String remarks = recharge.getRemarks();
        String message = recharge.getMessage();
        System.out.println(recharge.getError());
        System.out.println(remarks);
        System.out.println(message);



    }

}
