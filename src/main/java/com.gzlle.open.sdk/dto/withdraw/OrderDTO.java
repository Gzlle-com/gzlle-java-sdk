package com.gzlle.open.sdk.dto.withdraw;

import java.math.BigDecimal;

public class OrderDTO {
    //企业订单号
    private String tradeNo;
    //业务经营费用
    private BigDecimal bizFee;
    //服务商ID
    private String providerId;
    //姓名
    private String name;
    //自由职业者在企业编号
    private String employeeNo;
    //证件类型 0:身份证
    private Integer papersType;
    //收款人证件号码

    private String papersNo;
    //收款账号/银行卡/支付宝账号
    private String bankCardNo;
    //收款人银行卡/支付宝预留姓名
    private String bankName;
    //收款人手机号
    private String bankPhone;
    //接收该订单处理结果的后端回调url。当该url没有传值时，系统会使用后台开发者配置中的回调链接。注意:该url必须为可以直接访问的http链接,例如:https://www.baidu.com
    private String notifyUrl;
    //个人账户收款方式，当绑定了多个收款方式时，该参数必填。1：银行卡 2：支付宝
    private Integer paymentType;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getBizFee() {
        return bizFee;
    }

    public void setBizFee(BigDecimal bizFee) {
        this.bizFee = bizFee;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
}
