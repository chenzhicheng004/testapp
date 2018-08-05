package com.czc.testapp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by shiqian on 2018/8/5
 */
public class TestListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("abc" + (int) (Math.random() * 1000));
                }
            }
        }).start();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
