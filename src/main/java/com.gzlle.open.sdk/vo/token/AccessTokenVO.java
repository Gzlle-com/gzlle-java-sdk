package com.gzlle.open.sdk.vo.token;

import com.gzlle.open.sdk.vo.BaseVO;

public class AccessTokenVO extends BaseVO {
    //token
    private String accessToken;
    //有效时间
    private String expiresIn;


    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


}
