package com.gzlle.open.sdk.api;

import com.gzlle.open.sdk.dto.ContractCallbackDTO;

public interface ContractCallbackHandler {
    void processCallback(ContractCallbackDTO contractCallbackDTO);

}
