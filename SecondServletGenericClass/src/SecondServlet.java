

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SecondServlet")
public class SecondServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<b>Hello Generic Class </b>");
		pw.print("</html></body>");
		log("message");
	}
	public void log(String msg){};
	
	
}
