package com.example.config;

import com.example.interceptor.Interceptor1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
     
    @Override
     public void addInterceptors(InterceptorRegistry registry) {
         //注册拦截器 拦截规则
        //多个拦截器时 以此添加 执行顺序按添加顺序
        registry.addInterceptor(new Interceptor1()).addPathPatterns("/*");
        super.addInterceptors(registry);
     }

}