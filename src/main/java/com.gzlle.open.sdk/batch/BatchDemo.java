package com.gzlle.open.sdk.batch;

import com.google.gson.Gson;
import com.gzlle.open.sdk.api.BatchCallbackHandler;
import com.gzlle.open.sdk.dto.batch.BatchCallbackDTO;
import com.gzlle.open.sdk.dto.batch.CancleOrderDTO;
import com.gzlle.open.sdk.dto.batch.ListOrdersDTO;
import com.gzlle.open.sdk.dto.batch.PayOrderDTO;
import com.gzlle.open.sdk.dto.batch.SelectDetailDTO;
import com.gzlle.open.sdk.dto.batch.TradeOrderDTO;
import com.gzlle.open.sdk.exceptions.SignException;
import com.gzlle.open.sdk.utils.BaseUrlUtil;
import com.gzlle.open.sdk.utils.BeanToMapUtil;
import com.gzlle.open.sdk.utils.CallbackUtil;
import com.gzlle.open.sdk.utils.HttpUtil;
import com.gzlle.open.sdk.utils.NumberUtil;
import com.gzlle.open.sdk.utils.SignUtil;
import com.gzlle.open.sdk.vo.BaseVO;
import com.gzlle.open.sdk.vo.CallbackVO;
import com.gzlle.open.sdk.vo.batch.GetBalanceVO;
import com.gzlle.open.sdk.vo.batch.ListOrdersVO;
import com.gzlle.open.sdk.vo.batch.OrderDetailVO;
import com.gzlle.open.sdk.vo.batch.SelectDetailVO;
import com.gzlle.open.sdk.vo.batch.TradeOrderVO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.SortedMap;
public class BatchDemo {
    /**
     * 取消订单接口
     */
    public static BaseVO cancleOrder(String token, CancleOrderDTO cancleOrderDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/batch/cancel";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(cancleOrderDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, BaseVO.class);
    }

    /**
     * 查询订单列表接口
     */
    public static ListOrdersVO listOrders(String token, ListOrdersDTO listOrdersDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/batch/list";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(listOrdersDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, ListOrdersVO.class);
    }

    //查看订单详情信息接口
    public static OrderDetailVO orderDetail(String token, String id) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/batch/get/" + id;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, OrderDetailVO.class);
    }

    //查询企业余额接口
    public static GetBalanceVO getBalance(String token, String providerId) {
        String url = BaseUrlUtil.API_BASE_URL + "/account/balance/" + providerId;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        GetBalanceVO getBalanceVO=new GetBalanceVO();
        if (NumberUtil.isNumber(result)){
            getBalanceVO.setMoney(result);
        }else {
            return new Gson().fromJson(result, GetBalanceVO.class);
        }
        return getBalanceVO;

    }

    /**
     * 查询订单明细接口
     */
    public static SelectDetailVO selectDetail(String token, SelectDetailDTO selectDetailDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/batch/detail/list";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(selectDetailDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, SelectDetailVO.class);
    }

    /**
     * 创建交易订单接口
     */
    public static TradeOrderVO TradeOrder(String token, TradeOrderDTO tradeOrderDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/batch/add";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(tradeOrderDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, TradeOrderVO.class);

    }
    /**
     * 确认支付订单接口
     */
    public static BaseVO payOrder(String token, PayOrderDTO payOrderDTO) {
        String url = BaseUrlUtil.API_BASE_URL + "/orders/batch/pay";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(payOrderDTO);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, BaseVO.class);
    }

    //处理回调请求
    public static void processCallback(HttpServletRequest request, HttpServletResponse response, BatchCallbackHandler batchCallbackHandler, String appKey) {
        BatchCallbackDTO batchCallbackDTO = CallbackUtil.parseObject(request, BatchCallbackDTO.class);
        //验证签名合法性
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(batchCallbackDTO);
        paramters.remove("sign");
        String sign = SignUtil.createOpenSign(paramters, appKey);
        try {
            if (!sign.equals(batchCallbackDTO.getSign())) {
                throw new SignException("签名不合法");
            }
        } catch (SignException e) {

        }
        try {
            if (batchCallbackHandler != null) {
                batchCallbackHandler.processCallback(batchCallbackDTO);
            }
        } catch (Exception e) {
            System.err.println("处理回调请求失败");
        }
        response.setContentType("application/json");

        try {
            CallbackVO callbackVO = new CallbackVO();
            callbackVO.setMessage("成功");
            callbackVO.setResponseCode(200);
            Gson gson = new Gson();
            String str = gson.toJson(callbackVO);
            PrintWriter writer = response.getWriter();
            writer.write(str);
        } catch (IOException e) {
            System.err.println("写入回调处理结果失败");
        }


    }
}
