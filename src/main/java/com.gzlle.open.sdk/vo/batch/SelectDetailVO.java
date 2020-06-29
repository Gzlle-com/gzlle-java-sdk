package com.gzlle.open.sdk.vo.batch;

import com.gzlle.open.sdk.vo.BaseVO;

import java.util.List;

public class SelectDetailVO extends BaseVO {
   private Integer  pages;
   List<BaseDetailVO> list;

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<BaseDetailVO> getList() {
        return list;
    }

    public void setList(List<BaseDetailVO> list) {
        this.list = list;
    }
}
