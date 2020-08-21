package com.gzlle.open.sdk.api;

import com.gzlle.open.sdk.dto.batch.BatchCallbackDTO;

public interface BatchCallbackHandler {
    void processCallback(BatchCallbackDTO batchCallbackDTO);
}
