package web.gc.listener;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import web.gc.service.AccessAdd;

public class AccessListener implements ServletContextListener{
	private AccessAdd add;
	
	public AccessListener() {
		super();
		add=new AccessAdd();
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		int count=(int) arg0.getServletContext().getAttribute("count");
		add.setTimes(count);
	}	

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		int count=add.getTime();
		arg0.getServletContext().setAttribute("count", count);
		add.desOnline(1);
	}

}
