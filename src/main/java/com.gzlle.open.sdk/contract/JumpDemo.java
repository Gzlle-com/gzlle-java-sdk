package com.gzlle.open.sdk.contract;


import com.gzlle.open.sdk.dto.contract.JumpDTO;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

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
        String params=null;
        try {
            String encode = URLEncoder.encode(callbackUrl, "utf-8");
            if (encode==null ||encode.equals("")){
                params = "employeeId=" + jumpDTO.getEmployeeId() + "&corpId=" + jumpDTO.getCorpId() + "&userToken=" + jumpDTO.getUserToken();
            }else {
                params = "employeeId=" + jumpDTO.getEmployeeId() + "&corpId=" + jumpDTO.getCorpId() + "&userToken=" + jumpDTO.getUserToken() + "&callbackUrl=" + encode;
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return BASE_URL + params;
    }

}
