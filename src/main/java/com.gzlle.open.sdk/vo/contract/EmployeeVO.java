package com.gzlle.open.sdk.vo.contract;

import com.gzlle.open.sdk.vo.BaseVO;

public class EmployeeVO extends BaseVO {
    //自然人在工资来了平台唯一编号
    private String employeeId;
    //拓展参数
    private String extra;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }


}
