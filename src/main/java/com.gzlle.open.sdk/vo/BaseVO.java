package com.gzlle.open.sdk.vo;

public class BaseVO {
    //错误码
    private String error;
    //错误信息
    private String message;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
