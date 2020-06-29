package com.gzlle.open.sdk.vo.batch;

import com.gzlle.open.sdk.vo.BaseVO;

import java.util.List;

public class ListOrdersVO extends BaseVO {
    //总页数
    private  Integer pages;

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
    private List<BaseOrdersVO>list;

    public List<BaseOrdersVO> getList() {
        return list;
    }

    public void setList(List<BaseOrdersVO> list) {
        this.list = list;
    }
}
