package com.dh.chat.zuul.service.web;

import lombok.Getter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author Santiago Mamani
 */
public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {

    @Getter
    private final Long accountId;

    @Getter
    private final Long userId;

    public JwtAuthenticationToken(Long accountId,
                                  Long userId,
                                  Object principal,
                                  Object credentials,
                                  Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);

        this.accountId = accountId;
        this.userId = userId;
    }
}
