package com.gzlle.open.sdk.vo.contract;


import com.gzlle.open.sdk.vo.BaseVO;

public class GetEmployeeVO extends BaseVO {
    //employeeId
    private String id;
    //姓名
    private String name;
    //手机号
    private String phone;
    //证件类型 0:身份证
    private Integer papersType;
    //证件号码
    private String papersNo;
    //银行卡号
    private String bankCardNo;
    //银行预留手机号
    private String bankPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPapersType() {
        return papersType;
    }

    public void setPapersType(Integer papersType) {
        this.papersType = papersType;
    }

    public String getPapersNo() {
        return papersNo;
    }

    public void setPapersNo(String papersNo) {
        this.papersNo = papersNo;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    //自由职业者在企业编号
    private String employeeNo;
    //扩展参数
    private String extra;
    //0未签 1已签 2/3签署中
    private Integer contractStatus;


}
