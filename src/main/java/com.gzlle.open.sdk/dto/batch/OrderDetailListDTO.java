package com.gzlle.open.sdk.dto.batch;

public class OrderDetailListDTO {
    //明细流水号(系统调用方明细的唯一标识)
   private String corpFlowNumber;
   //自由职业者工号
    private String  employeeNo;
    //姓名
    private String  name;
    //身份证号码
    private String  papersNo;
    //银行预留手机号码
    private String  bankPhone;
    //开户行名称
    private String  bankName;
    //银行账号
    private String  bankCardNo;
    //经营服务费税前(与 经营服务费税后 选填一个),取值范围为0.01~100000，精确到分，四舍五入，单位：元
    private String  bizBeforeFee;
    //经营服务费税后(与 经营服务费税前 选填一个,取值范围为0.01~50000，精确到分，四舍五入，单位：元
    private String  bizFee;

    public String getCorpFlowNumber() {
        return corpFlowNumber;
    }

    public void setCorpFlowNumber(String corpFlowNumber) {
        this.corpFlowNumber = corpFlowNumber;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPapersNo() {
        return papersNo;
    }

    public void setPapersNo(String papersNo) {
        this.papersNo = papersNo;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBizBeforeFee() {
        return bizBeforeFee;
    }

    public void setBizBeforeFee(String bizBeforeFee) {
        this.bizBeforeFee = bizBeforeFee;
    }

    public String getBizFee() {
        return bizFee;
    }

    public void setBizFee(String bizFee) {
        this.bizFee = bizFee;
    }
}
