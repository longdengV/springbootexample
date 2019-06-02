package com.example.config;

import com.example.pojo.IDCard;
import com.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试@Configuration的基本使用情况
 */
@Configuration
public class Config {

    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public IDCard idCard(){
        return new IDCard();
    }

}
