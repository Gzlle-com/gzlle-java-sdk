package com.gzlle.open.sdk.vo.batch;

import java.security.PrivateKey;

public class BaseOrdersVO {
    //平台订单唯一id
   private String id;
   //批次号，订单唯一标示
    private String batchNo;
    //总服务费
    private String totalFee	;
    //基础服务费
    private String baseFee	;
    //业务经营费用(个人到手)
    private String bizFee;
    //经营服务费税前,税前金额
    private String  bizBeforeFee;
    //实际支付的总服务费
    private String  payTotalFee;
    //实际支付的基础服务费
    private String  payBaseFee	;
    //实际支付的经营服务费税前
    private String payBizBeforeFee	;
    //实际支付金额
    private String payFee;
    //交易状态,0:上传中 1:待审核 2:未通过 3:待付款 4:待收款 5:待支付 6:已支付 7:已取消 8:支付中 99:作废
    private Integer status	;
    //下单时间
    private String created	;
    //明细总行数
    private String totalLine;
    //失败总条数
    private String totalFail;
    //成功总条数
    private String totalSuccess	;
    //备注信息
    private String remarks	;
    //警告信息
    private String warn;
    //当前绑定的服务商账户
    private String providerAccount;
    //支付时间
    private String payTime	;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(String baseFee) {
        this.baseFee = baseFee;
    }

    public String getBizFee() {
        return bizFee;
    }

    public void setBizFee(String bizFee) {
        this.bizFee = bizFee;
    }

    public String getBizBeforeFee() {
        return bizBeforeFee;
    }

    public void setBizBeforeFee(String bizBeforeFee) {
        this.bizBeforeFee = bizBeforeFee;
    }

    public String getPayTotalFee() {
        return payTotalFee;
    }

    public void setPayTotalFee(String payTotalFee) {
        this.payTotalFee = payTotalFee;
    }

    public String getPayBaseFee() {
        return payBaseFee;
    }

    public void setPayBaseFee(String payBaseFee) {
        this.payBaseFee = payBaseFee;
    }

    public String getPayBizBeforeFee() {
        return payBizBeforeFee;
    }

    public void setPayBizBeforeFee(String payBizBeforeFee) {
        this.payBizBeforeFee = payBizBeforeFee;
    }

    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getTotalLine() {
        return totalLine;
    }

    public void setTotalLine(String totalLine) {
        this.totalLine = totalLine;
    }

    public String getTotalFail() {
        return totalFail;
    }

    public void setTotalFail(String totalFail) {
        this.totalFail = totalFail;
    }

    public String getTotalSuccess() {
        return totalSuccess;
    }

    public void setTotalSuccess(String totalSuccess) {
        this.totalSuccess = totalSuccess;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getWarn() {
        return warn;
    }

    public void setWarn(String warn) {
        this.warn = warn;
    }

    public String getProviderAccount() {
        return providerAccount;
    }

    public void setProviderAccount(String providerAccount) {
        this.providerAccount = providerAccount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
}
