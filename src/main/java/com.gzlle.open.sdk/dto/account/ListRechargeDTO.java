package com.gzlle.open.sdk.dto.account;

public class ListRechargeDTO {
    //服务商ID,当有多个服务商时，必填
  private String  providerId;
  //充值状态 0,已提交 1，余额审查中 2,充值完成 3,审核不通过 9,充值驳回 19,已中断 99,充值作废
    private Integer status;
    //开户人姓名/开户行名称(模糊查询)
    private String bankKeyword;
    //汇款时间开始日期(yyyyMMddHHmmss)
    private String startDate;
    //汇款时间结束日期
    private String  endDate;
    //分页页数(从1开始,不传默认为1)
    private  Integer  pageNum;
    //分页数量大小
    private Integer  pageSize;

  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getBankKeyword() {
    return bankKeyword;
  }

  public void setBankKeyword(String bankKeyword) {
    this.bankKeyword = bankKeyword;
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
