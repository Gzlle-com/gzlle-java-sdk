package com.gzlle.open.sdk.vo.batch;

public class BaseDetailVO {
    //平台订单明细唯一id
   private String id;
   //平台订单唯一id
    private String orderId;
    //批次号，订单唯一标示
    private String batchNo;
    //费率，精确到小数点后两位
    private String rate	;
    //总服务费
    private String totalFee;
    //基础服务费
    private String baseFee;
    //业务经营费用(个人到手)
    private String bizFee;
    //经营服务费税前,税前金额
    private String  bizBeforeFee;
    //实际支付金额
    private String payFee;
    //支付时间
    private String payTime;
    //交易明细状态,0:未付 1:成功 2:失败 99:作废
    private Integer  payStatus;
    //下单时间
    private String created	;
    //银行卡号
    private String  bankCardNo;
    //银行卡预留手机
    private String  bankPhone;
    //银行备注
    private String bankRemarks;
    //企业交易流水号
    private String corpFlowNumber;
    //姓名
    private String name	;
    //证件号
    private String papersNo;
    //自由职业者工号
    private String employeeNo;
    //是否跨档,0:不跨档 1:跨档
    private Integer  across;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
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

    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
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

    public String getBankRemarks() {
        return bankRemarks;
    }

    public void setBankRemarks(String bankRemarks) {
        this.bankRemarks = bankRemarks;
    }

    public String getCorpFlowNumber() {
        return corpFlowNumber;
    }

    public void setCorpFlowNumber(String corpFlowNumber) {
        this.corpFlowNumber = corpFlowNumber;
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

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Integer getAcross() {
        return across;
    }

    public void setAcross(Integer across) {
        this.across = across;
    }
}
