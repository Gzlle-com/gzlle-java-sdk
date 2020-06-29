package com.gzlle.open.sdk.vo.contract;

import com.gzlle.open.sdk.vo.BaseVO;

public class UserTokenVO extends BaseVO {
    //企业自由职业者，进行页面签署时，需要携带的授权userToken
    private String userToken;
    //token有效时间
    private String expiresIn;


    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }


}
