package com.dh.chat.zuul.service.client.users;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Santiago Mamani
 */
@Service
class UsersModuleService {

    @Autowired
    private UsersModuleClient client;

    @HystrixCommand
    public AccountUser findAccountUser(Long accountId, Long userId) {
        return client.findAccountUser(accountId, userId);
    }
}
