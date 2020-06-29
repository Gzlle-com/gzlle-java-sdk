package com.gzlle.open.sdk.dto.expense;

public class ImportOrderDTO {
    //服务商ID,当有多个服务商时，必填
 private String providerId;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}
