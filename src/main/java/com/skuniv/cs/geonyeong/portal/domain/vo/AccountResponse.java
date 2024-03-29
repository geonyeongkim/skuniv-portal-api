package com.skuniv.cs.geonyeong.portal.domain.vo;

import com.skuniv.cs.geonyeong.portal.enums.AccountType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountResponse {
    private String token;
    private AccountType accountType;
    private String name;

    @Builder
    public AccountResponse(String token, AccountType accountType, String name) {
        this.token = token;
        this.accountType = accountType;
        this.name = name;
    }
}
