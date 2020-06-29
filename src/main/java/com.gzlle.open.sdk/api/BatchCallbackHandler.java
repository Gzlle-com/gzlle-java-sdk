package com.gzlle.open.sdk.api;

import com.gzlle.open.sdk.dto.batch.BatchCallbackDTO;
import com.gzlle.open.sdk.dto.withdraw.WithdrawCallbackDTO;

public interface BatchCallbackHandler {
    void processCallback(BatchCallbackDTO batchCallbackDTO);
}
