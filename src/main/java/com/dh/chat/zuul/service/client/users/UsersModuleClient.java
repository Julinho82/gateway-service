package com.dh.chat.zuul.service.client.users;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Santiago Mamani
 */
@FeignClient(name = "${users.service.name}")
@RequestMapping(value = "/system")
interface UsersModuleClient {

    @RequestMapping(
            value = "/accounts/{accountId}/users/{userId}",
            method = RequestMethod.GET
    )
    AccountUser findAccountUser(@PathVariable("accountId") Long accountId, @PathVariable("userId") Long userId);
}
