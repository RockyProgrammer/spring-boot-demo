package com.example.springbootdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    private RedisDao redisDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testRedis(){
        redisDao.setValue("name","润漪");
        redisDao.setValue("age","24");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }


}
