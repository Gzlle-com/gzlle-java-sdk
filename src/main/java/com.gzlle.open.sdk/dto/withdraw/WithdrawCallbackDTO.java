package com.gzlle.open.sdk.dto.withdraw;

import java.math.BigDecimal;
import java.util.Date;

public class WithdrawCallbackDTO {
    //服务商ID
   private String providerId;
   //企业id
    private String  corpId;
    //回调通知类型,1业务签约,2:提现订单状态
    private Integer noticeType;
    //回调说明
    private String content;
    //校验用的随机校验码
    private String nonce;
    //校验用的签名值
    private String sign	;
    //我方平台订单唯一id
    private String id;
    //企业订单号，订单唯一标示
    private String tradeNo;
    //执行费率
    private BigDecimal rate;
    //总费用
    private BigDecimal totalAmount;
    //基础服务费
    private BigDecimal baseFee;
    //业务经营费用(个人到手)
    private BigDecimal bizFee;
    //经营服务费税前,税前金额
    private BigDecimal bizBeforeFee;
    //交易手续费
    private BigDecimal tradeFee	;
    //订单状态:0:支付中,1:支付成功,9:支付失败
    private Integer status;
    //创建时间
    private Date created;
    //自由职业者姓名
    private String  name;
    //自由职业者工号
    private String   employeeNo	;
    //自由职业者在我方平台唯一编号
    private String  employeeId	;
    //银行卡预留手机
    private String  bankPhone;
    //银行卡号
    private String  bankCardNo	;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(BigDecimal baseFee) {
        this.baseFee = baseFee;
    }

    public BigDecimal getBizFee() {
        return bizFee;
    }

    public void setBizFee(BigDecimal bizFee) {
        this.bizFee = bizFee;
    }

    public BigDecimal getBizBeforeFee() {
        return bizBeforeFee;
    }

    public void setBizBeforeFee(BigDecimal bizBeforeFee) {
        this.bizBeforeFee = bizBeforeFee;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
}
