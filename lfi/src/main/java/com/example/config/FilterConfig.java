package com.example.config;

import com.example.filter.Filter1;
import com.example.filter.Filter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * 过滤器的配置类
 * 主要配置过滤器的执行顺序过程
 */

public class FilterConfig {

    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean =
                new FilterRegistrationBean<>();

        filterFilterRegistrationBean.setFilter(filter2());
        //过滤器名称
        filterFilterRegistrationBean.setName("filter2");
        //设置顺序
        filterFilterRegistrationBean.setOrder(9);

        filterFilterRegistrationBean.setFilter(filter1());
        //过滤器名称
        filterFilterRegistrationBean.setName("filter1");
        //设置顺序
        filterFilterRegistrationBean.setOrder(10);

        filterFilterRegistrationBean.setFilter(filter1());
        return filterFilterRegistrationBean;
    }


    public Filter filter2(){
        return new Filter2();
    }

    public Filter filter1(){
        return new Filter1();
    }
}
