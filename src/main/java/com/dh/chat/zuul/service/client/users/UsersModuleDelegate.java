package com.dh.chat.zuul.service.client.users;

import com.dh.chat.zuul.service.web.JwtTokenAuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Santiago Mamani
 */
@Component
public class UsersModuleDelegate {

    @Autowired
    private UsersModuleService facade;

    public AccountUser findAccountUser(Long accountId, Long userId) {
        try {
            return facade.findAccountUser(accountId, userId);
        } catch (Exception e) {
            throw new JwtTokenAuthenticationException("Unable to complete the authentication process", e);
        }
    }
}
