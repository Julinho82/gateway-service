package com.dh.chat.zuul.service.web;

/**
 * @author Santiago Mamani
 */
public class JwtTokenAuthenticationException extends RuntimeException {

    public JwtTokenAuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public JwtTokenAuthenticationException(String message) {
        super(message);
    }
}
