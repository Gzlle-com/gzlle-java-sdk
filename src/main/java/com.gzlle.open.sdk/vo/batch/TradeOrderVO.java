package com.gzlle.open.sdk.vo.batch;

import java.util.List;

public class TradeOrderVO {
//平台订单唯一id，成功时返回
   private String id;
   //批次号（调用方系统对该交易订单的唯一标识，每个批次订单必须唯一）。
    private String batchNo;
    //下单时间，成功时返回, 如：20190715235959
    private String  created;
    //返回类型:0 正常,1 有错误
    private Integer returnType;
    //错误信息,returnType为1时返回
    private List errorList;

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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public List getErrorList() {
        return errorList;
    }

    public void setErrorList(List errorList) {
        this.errorList = errorList;
    }
}
