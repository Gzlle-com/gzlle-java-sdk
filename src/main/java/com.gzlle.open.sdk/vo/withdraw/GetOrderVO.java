package com.gzlle.open.sdk.vo.withdraw;

import com.gzlle.open.sdk.vo.BaseVO;

import java.math.BigDecimal;
import java.util.Date;

public class GetOrderVO extends BaseVO {
//平台订单唯一id
 private String   id	;
 //企业订单号，订单唯一标示
    private String  tradeNo	;
    //企业id
    private String corpId	;
    //执行费率
   private BigDecimal rate;
   //总费用
    private BigDecimal  totalAmount	 ;
    //总服务费
    private BigDecimal totalFee ;

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

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
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

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
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

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPapersNo() {
        return papersNo;
    }

    public void setPapersNo(String papersNo) {
        this.papersNo = papersNo;
    }

    public Integer getPapersType() {
        return papersType;
    }

    public void setPapersType(Integer papersType) {
        this.papersType = papersType;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    //基础服务费
    private BigDecimal  baseFee ;
    //业务经营费用(个人到手)
    private BigDecimal  bizFee	;
    //经营服务费税前,税前金额
    private BigDecimal  bizBeforeFee;
    //实际支付金额
    private BigDecimal  payFee	;
    //交易手续费
    private BigDecimal  tradeFee;
    //订单状态:0:支付中,1:支付成功,9:支付失败
    private Integer status;
    //下单时间
    private Date created;
    //服务商ID
    private String   providerId	 ;
    //银行卡号
    private String bankCardNo;
    //银行卡预留姓名
    private String  bankName;
    //银行卡预留手机
    private String  bankPhone;
    //	姓名
    private String  name	;
    //证件号
    private String  papersNo;
    //证件类型 0:身份证
    private Integer papersType;
    //自由职业者工号
    private String   employeeNo	 ;
    //自由职业者在平台唯一编号
    private String  employeeId	;
    //性别
    private String  sex	 ;
    //出生日期
    private String  birthday;
    //备注,交易失败时,会将失败原因体现在该字段
    private String remarks	;






}
