package com.gzlle.open.sdk.api;

import com.gzlle.open.sdk.dto.ContractCallbackDTO;
import com.gzlle.open.sdk.dto.withdraw.WithdrawCallbackDTO;

public interface WithdrawCallbackHandler {
    void processCallback(WithdrawCallbackDTO withdrawCallbackDTO);
}