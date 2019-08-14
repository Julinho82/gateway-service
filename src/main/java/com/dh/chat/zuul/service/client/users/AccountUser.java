package com.dh.chat.zuul.service.client.users;

import lombok.Getter;

/**
 * @author Santaigo Mamani
 */
public class AccountUser {

    @Getter
    private Long accountId;

    @Getter
    private Long userId;

    @Getter
    private UserType userType;

}
