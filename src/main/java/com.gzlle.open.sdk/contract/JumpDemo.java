package com.gzlle.open.sdk.contract;

import com.gzlle.open.sdk.dto.JumpDTO;

//页面签约跳转
public class JumpDemo {

    private static JumpDemo instance = new JumpDemo();

    private static final String BASE_URL = "https://webapp.gzlle.com/contract-open/spa.html?";

    public static JumpDemo getInstance() {
        return instance;
    }

    private JumpDemo() {

    }

    public String getSignPageUrl(JumpDTO jumpDTO, String callbackUrl) {
        String params = "employeeId=" + jumpDTO.getEmployeeId() + "&corpId=" + jumpDTO.getCorpId() + "&userToken=" + jumpDTO.getUserToken() + "&callbackUrl=" + callbackUrl;
        return BASE_URL + params;
    }

}
