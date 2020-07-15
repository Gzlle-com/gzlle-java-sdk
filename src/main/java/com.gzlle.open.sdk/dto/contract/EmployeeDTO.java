package com.gzlle.open.sdk.dto.contract;

import java.util.Date;

public class EmployeeDTO {
    //employeeId,自由职业者id和手机号码必须填一个
    private String id;
    //姓名
    private String name;
    //手机号
    private String phone;
    //自由职业者在企业的唯一编号
    private String employeeNo;
    //证件类型 0:身份证
    private Integer papersType;
    //证件号码
    private String papersNo;
    //服务商Id
    private String providerId;
    //银行卡号
    private String bankCardNo;
    //银行预留手机号
    private String bankPhone;
    //扩展参数，回调时原文返回
    private String extra;
    // "电签状态 0未签 1已签 2签署中 9作废"
    private Integer contractStatus;

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    public Integer getCallbackStatus() {
        return callbackStatus;
    }

    public void setCallbackStatus(Integer callbackStatus) {
        this.callbackStatus = callbackStatus;
    }

    //"电签时间"
    private Date contractTime;
    // "回调状态 0:未回调 1:已回调 9:回调失败"
    private Integer callbackStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Integer getPapersType() {
        return papersType;
    }

    public void setPapersType(Integer papersType) {
        this.papersType = papersType;
    }

    public String getPapersNo() {
        return papersNo;
    }

    public void setPapersNo(String papersNo) {
        this.papersNo = papersNo;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
