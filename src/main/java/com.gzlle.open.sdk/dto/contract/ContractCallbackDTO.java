package com.gzlle.open.sdk.dto.contract;

public class ContractCallbackDTO {
    //企业id
    private String corpId;
    //回调通知类型,1业务签约
    private Integer noticeType;
    //回调说明
    private String content;
    //合同签署状态,0未签署,1已签署,2/3签署中,9作废
    private Integer contractStatus;
    //自由职业者唯一id
    private String employeeId;
    //自由职业者添加时,调用方传入的extra参数值
    private String extra;
    //自由职业者姓名
    private String name;
    //手机号码
    private String phone;
    //证件类型,0身份证
    private Integer papersType;
    //证件号码
    private String papersNo;
    //银行卡号
    private String bankCardNo;
    //编号,企业添加时传入的值
    private String employeeNo;
    //校验用的随机校验码
    private String nonce;
    //校验用的签名值
    private String sign;

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

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

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
}
