package web.gc.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import web.gc.service.AccessAdd;

public class SessionListener implements HttpSessionListener{
	private AccessAdd accessAdd=new AccessAdd();
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
			int count=accessAdd.getOnline();
			accessAdd.addOnline(count);
			System.out.println("session created");
		
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		
			int count=accessAdd.getOnline();
			accessAdd.desOnline(count);
			System.out.println("session destroyed");
			accessAdd.getOnline();
		
	}
	
}
