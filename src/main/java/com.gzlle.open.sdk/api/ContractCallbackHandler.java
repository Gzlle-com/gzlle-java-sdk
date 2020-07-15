package com.gzlle.open.sdk.api;

import com.gzlle.open.sdk.dto.contract.ContractCallbackDTO;


public interface ContractCallbackHandler {
    void processCallback(ContractCallbackDTO contractCallbackDTO);

}
