package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ParamterListener implements ServletRequestListener
{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) 
	{
	
		// TODO Auto-generated method stub
		
		String name=arg0.getServletRequest().getParameter("name");
		System.out.println("2------name----"+name);
	}

	

}
