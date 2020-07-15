package com.gzlle.open.sdk.dto.batch;

public class BatchCallbackDTO {
    //服务商ID
   private String providerId;
   //企业id
    private String corpId;
    //回调通知类型,1业务签约2:提现订单状态 3:批量订单状态 4:充值状态
    private Integer noticeType;
    //回调说明
    private String  content;
    //校验用的随机校验码
    private String  nonce;
    //校验用的签名值
    private String sign	;
    //平台订单唯一id
    private String  id;
    //批次号
    private String  batchNo;
    //总服务费
    private String  totalFee;
    //基础服务费
    private String  baseFee	;
    //业务经营费用(个人到手)
    private String  bizFee;
    //经营服务费税前,税前金额
    private String  bizBeforeFee;
    //交易状态,0:上传中 1:待审核 2:未通过 3:待付款 4:待收款 5:待支付 6:已支付 7:已取消 8:支付中 99:作废
    private Integer status;
    //实际支付的总服务费
    private String payTotalFee;
    //实际支付的基础服务费
    private String  payBaseFee;
    //实际支付的经营服务费税前
    private String payBizBeforeFee;
    //实际支付金额
    private String payFee;
    //下单时间
    private String created	;
    //支付时间
    private String  payTime;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
}
