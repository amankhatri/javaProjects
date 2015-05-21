

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {
	ServletConfig config = null;
	public void init(ServletConfig servletConfiguration){
		this.config = servletConfiguration;
		System.out.println("Servlet is initialized");
	}
	public  void service(ServletRequest req, ServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<b>Hello This is a simple Servlet</b>");
		pw.print("</html></body>");
	}
	public void destroy(){
		System.out.println("Servlet Destroyed");
	}
	public ServletConfig getServletConfig(){
		return config;
	}
	public String getServletInfo() {
		return "My Server ";
	}
	
}
