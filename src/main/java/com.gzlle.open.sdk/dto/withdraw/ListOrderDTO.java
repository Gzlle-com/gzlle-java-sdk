package com.gzlle.open.sdk.dto.withdraw;

import java.util.Date;
import java.util.List;

public class ListOrderDTO {
    //平台订单唯一id
    private String id;
    //企业订单号，订单唯一标示
    private String tradeNo;
    //服务商ID,当有多个服务商时，必填
    private String providerId;
    //订单状态:8支付中,6支付完成
    private Integer status;
    //人员ID列表
    private List<String> employeeIdList;
    //证件号列表
    private List<String> papersNoList;
    //交易开始日期
    private Date startDate;
    //交易结束日期
    private Date endDate;
    //排序字段 created + desc 为倒序,默认为创建时间倒叙
    private String orderBy;
    //页数，默认为1
    private Integer pageNum;
    //每页行数,默认为10
    private Integer pageSize;

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

    public List<String> getEmployeeIdList() {
        return employeeIdList;
    }

    public void setEmployeeIdList(List<String> employeeIdList) {
        this.employeeIdList = employeeIdList;
    }

    public List<String> getPapersNoList() {
        return papersNoList;
    }

    public void setPapersNoList(List<String> papersNoList) {
        this.papersNoList = papersNoList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
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
