package com.example.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account,Long> {
    Account findByName(String name);
}
