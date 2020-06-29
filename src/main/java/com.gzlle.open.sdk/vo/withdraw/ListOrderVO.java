package com.gzlle.open.sdk.vo.withdraw;


import com.gzlle.open.sdk.vo.BaseVO;

import java.util.List;

public class ListOrderVO extends BaseVO {
    //订单列表
    private List<BaseOrderVO> list;
    //总页数
    private Integer pages;


    public List<BaseOrderVO> getList() {
        return list;
    }

    public void setList(List<BaseOrderVO> list) {
        this.list = list;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }


}
