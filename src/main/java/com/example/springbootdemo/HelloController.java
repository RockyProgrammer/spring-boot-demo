package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class HelloController {

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private User user;

    @RequestMapping("/hello")
    public String hello(){
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("my")
    public ConfigBean my(){
        return configBean;
    }

    @RequestMapping("user")
    public String user(){
        return "name:" + user.getName() + " age:" + user.getAge();
    }
}
