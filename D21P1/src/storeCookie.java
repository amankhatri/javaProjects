

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class storeCookie
 */
@WebServlet("/storeCookie")
public class storeCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public storeCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");//Mime type setup
		String name = request.getParameter("name"); //reqeust the parameters from browser
		String emailId = request.getParameter("eid");
		String pwd = request.getParameter("t3");
		
		/*Create the cookie object and store it in cookie class object using key and value pair. 
		 * Now create a cookie and send the cookie to browser. Server responseds back to browser*/
		Cookie c3 = new Cookie("Password",pwd);
		response.addCookie(c3);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
