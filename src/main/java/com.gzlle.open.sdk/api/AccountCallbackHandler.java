package com.gzlle.open.sdk.api;

import com.gzlle.open.sdk.dto.account.AccountCallbackDTO;

public interface AccountCallbackHandler {
    void processCallback(AccountCallbackDTO accountCallbackDTO);

}
