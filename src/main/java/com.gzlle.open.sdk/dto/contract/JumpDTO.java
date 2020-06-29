package com.gzlle.open.sdk.dto;

public class JumpDTO {
    //用户Id, 添加自由职业者接口返回
    private String employeeId;
    //企业Id,在获取appKey的邮件里有提供
    private String corpId;
    //获取用户token 接口获取
    private  String userToken;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
