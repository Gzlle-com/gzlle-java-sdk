package com.gzlle.open.sdk.dto.account;

public class CreateRechargeDTO {
    //充值金额(保留两位小数,最低为0.01,最高为999999999.99)
   private String amount;
   //服务商ID,当有多个服务商时，必填
    private String providerId;
    //开户行名称(如果是支付宝充值则传"支付宝")
    private String bank;
    //银行卡号(如果是支付宝充值则传支付宝账号)
    private String  bankNo;
    //银行卡预留姓名(如果是支付宝充值则传支付宝姓名)
    private String bankName;
    //付款凭证图片(base64编码)
    private String payImg;
    //付款时间(格式: yyyyMMddHHmmss)
    private String payTime;
    //支付类型 0:银行转账 1:支付宝转账
    private Integer payType;
    //备注
    private String remarks;
    //流水号
    private String  serialNumber;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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
