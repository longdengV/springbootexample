package com.example.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * 使用springboot做一个请求监听器
 */
@WebListener
public class RequestListener1 implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println(this.getClass().getName() + "监听器销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println(this.getClass().getName() + "监听器创建");
        HttpServletRequest servletRequest = (HttpServletRequest) sre.getServletRequest();
        String remoteUser = servletRequest.getRemoteUser();
        System.out.println(remoteUser);
    }

}
