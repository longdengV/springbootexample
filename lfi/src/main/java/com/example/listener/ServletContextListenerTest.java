package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听生命周期
 * 测试ServletContextListenerTest
 */
public class ServletContextListenerTest implements ServletContextListener {
    
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println("放了一点东西到servletContext域中");
        servletContext.setAttribute("user","user");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
