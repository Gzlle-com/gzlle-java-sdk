package com.gzlle.open.sdk.vo.batch;

import com.gzlle.open.sdk.vo.BaseVO;

public class OrderDetailVO extends BaseVO {
    //平台订单唯一id
    private String  id;
    //批次号，订单唯一标示
    private String batchNo;
    //总服务费
    private String totalFee;
    //基础服务费
    private String baseFee;
    //业务经营费用(个人到手)
    private String  bizFee;
    //经营服务费税前,税前金额
    private String  bizBeforeFee;
    //实际支付的总服务费
    private String payTotalFee;
    //实际支付的基础服务费
    private String  payBaseFee;
    //实际支付的经营服务费税前
    private String payBizBeforeFee;
    //实际支付金额
    private String  payFee;
    //交易状态,0:上传中 1:待审核 2:未通过 3:待付款 4:待收款 5:待支付 6:已支付 7:已取消 8:支付中 99:作废
    private Integer status;
    //下单时间
    private String created;
    //明细总行数
    private String  totalLine;
    //失败总条数
    private String  totalFail;
    //成功总条数
    private String totalSuccess;
    //备注信息
    private String remarks	;
    //警告信息
    private String warn	;
    //当前绑定的服务商账户
    private String providerAccount;
    //支付时间
    private String  payTime	;




}
