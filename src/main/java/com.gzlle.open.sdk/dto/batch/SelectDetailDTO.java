package com.gzlle.open.sdk.dto.batch;

public class SelectDetailDTO {
    //平台订单唯一id
  private String  orderId;
  //平台订单明细唯一id
    private String  id;
    //批次号
    private String batchNo;
    //企业交易流水号
    private String  corpFlowNumber;
    //交易开始日期，默认为3个月前,如：20190715000000
    private String  startDate;
    //交易结束日期，默认为今天最后一秒,如: 20191015235959
    private String endDate;
    //交易明细状态,0:未付 1:成功 2:失败 99:作废
    private Integer payStatus;
    //关键词模糊匹配：姓名/手机/身份证/银行卡/用户编号/批次号
    private String keyword;
    //证件号(身份证号码/护照号码)
    private String papersNo;
    //服务商ID,当有多个服务商时，必填
    private String  providerId;
    //页数，默认为1
    private Integer pageNum	;
    //每页行数,默认为10，最大为500
    private Integer pageSize;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getCorpFlowNumber() {
        return corpFlowNumber;
    }

    public void setCorpFlowNumber(String corpFlowNumber) {
        this.corpFlowNumber = corpFlowNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
