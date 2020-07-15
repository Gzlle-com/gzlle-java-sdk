package com.gzlle.open.sdk.vo.contract;

import com.gzlle.open.sdk.vo.BaseVO;

public class QueryContractVO extends BaseVO {
    //0未签 1已签 2签署中
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
