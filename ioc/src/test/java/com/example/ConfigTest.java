package com.example;

import com.example.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Configuration的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest("Application.class")
public class ConfigTest {

    @Resource
    private User user;

    @Test
    public void test1(){
        System.out.println(user.getIdCard());
    }
}
