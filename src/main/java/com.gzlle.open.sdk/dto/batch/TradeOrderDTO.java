package com.gzlle.open.sdk.dto.batch;

import java.util.List;

public class TradeOrderDTO {
    //服务商ID,当有多个服务商时，必填。
    private String providerId;
    //批次号（调用方系统对该交易订单的唯一标识，每个批次订单必须唯一）
    private String batchNo;
    //订单明细
    private List<OrderDetailListDTO> orderDetailList;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public List<OrderDetailListDTO> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetailListDTO> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
