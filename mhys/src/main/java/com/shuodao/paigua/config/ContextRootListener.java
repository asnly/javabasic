package com.shuodao.paigua.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;




public class ContextRootListener implements ServletContextListener {
	public void contextDestroyed(final ServletContextEvent event) {
       // Do nothing
    }
	public void contextInitialized(ServletContextEvent event) {
		YamlConfig.getInstance().setContextPath(event.getServletContext().getContextPath());
       
    }
}