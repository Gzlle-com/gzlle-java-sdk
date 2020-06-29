package com.gzlle.open.sdk.dto.batch;

public class ListOrdersDTO {
    //平台订单唯一id
   private String id;
    //批次号
    private String batchNo;
    //交易开始日期，默认为3个月前,如：20190715000000
    private String startDate;
    //交易结束日期，默认为今天最后一秒,如: 20191015235959
    private String endDate;
    //交易状态,0:上传中 1:待审核 2:未通过 3:待付款 4:待收款 5:待支付 6:已支付 7:已取消 8:支付中 99:作废
    private Integer status;
    //服务商ID
    private String providerId;
    //页数，默认为1
    private Integer pageNum	;
   //每页行数,默认为10 ，最大为500
    private  Integer pageSize;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
