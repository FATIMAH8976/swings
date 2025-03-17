package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InterfaceServlet implements Servlet
{
	ServletConfig conf;
	@Override
	public void destroy()
	{
		System.out.println("Destroying the object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return conf;
	}

	@Override
	public String getServletInfo() {
		
		return ("This is SyBsc It");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		this.conf=conf;
		System.out.println("creating the object");
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is Service method");
		res.setContentType("Text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1> This is My first Servlet</h1>");
		out.println("<h1> TCurrent Date& time</h1>" +new Date().toString());
		
	}

}
