package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/name/{name}")
    public Account getAccount(@PathVariable("name") String name){
        return accountService.findByName(name);
    }

}
