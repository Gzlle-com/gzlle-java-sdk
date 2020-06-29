package com.gzlle.open.sdk.account;

import com.google.gson.Gson;
import com.gzlle.open.sdk.dto.account.CreateRechargeDTO;
import com.gzlle.open.sdk.utils.BeanToMapUtil;
import com.gzlle.open.sdk.utils.HttpUtil;
import com.gzlle.open.sdk.utils.SignUtil;
import com.gzlle.open.sdk.utils.baseUrlUtil;
import com.gzlle.open.sdk.vo.account.RechargeApplicationVO;
import java.util.LinkedHashMap;
import java.util.SortedMap;

public class AccountDemo {
    /**
     * 创建充值申请接口
     */
    public static RechargeApplicationVO createRecharge(String token, CreateRechargeDTO createRechargeDTO, String appKey) {

        String url = baseUrlUtil.API_BASE_URL + "/account/prestore/add";
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

    /**
     * 根据充值唯一ID查询单个充值申请接口
     */
    public static RechargeApplicationVO getRecharge(String token, String id) {
        String url = baseUrlUtil.API_BASE_URL + "/account/prestore/get/" + id;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, RechargeApplicationVO.class);

    }


}
