package com.sabu.springsecurityldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/04/19
 */
@RestController
public class HomeResource {

    @GetMapping("/")
    public String index() {
        return "Home Page";
    }
}
