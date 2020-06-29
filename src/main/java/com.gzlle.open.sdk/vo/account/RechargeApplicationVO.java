package com.gzlle.open.sdk.vo.account;

import com.gzlle.open.sdk.vo.BaseVO;

public class RechargeApplicationVO extends BaseVO {
    //充值申请唯一ID
    private String id;
    //充值金额(保留两位小数, 最低为0.01, 最高为999999999.99)
    private String amount;

    //充值余额(保留两位小数, 最低为0.01, 最高为999999999.99)
    private String balance;

    //充值所属服务商ID
    private String providerId;
    //开户行名称
    private String bank;
    //银行卡号
    private String bankNo;
    //银行卡预留姓名
    private String bankName;
    //付款凭证图片
    private String payImg;
    //付款时间(格式:yyyyMMddHHmmss)
    private String payTime;
    //充值状态 0,已提交 1，余额审查中 2,充值完成 3,审核不通过 9,充值驳回 19,已中断 99,充值作废
    private Integer status;
    //备注
    private String remarks;
    //流水号
    private String serialNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPayImg() {
        return payImg;
    }

    public void setPayImg(String payImg) {
        this.payImg = payImg;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
