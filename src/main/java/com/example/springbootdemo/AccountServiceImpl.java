package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;


    @Override
    public Account findByName(String name) {
        return accountDao.findByName(name);
    }
}
