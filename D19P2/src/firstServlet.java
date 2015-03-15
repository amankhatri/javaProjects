
/*ALl servelets should override 
 * 1) init()
 * 2) doGet/do Post
 * 3) destroy*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstServlet
 */
@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public void init() {
    	System.out.println("Init Method");

    }
    /* 1) The HttpServletRequest and HttpServlet Response objects are passed by the webserver.
     * These are the communication mediators for server and browser
     * 
     * 2)HttpServletRequest- will have all the details of the Request sent by the browser. 
     * 
     * 3)HttpServletResponse- will contain all the response which are sent to the browser.
     * */

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		/*Using a response object which server is giving to me, to open a stream for communication between webserver and 
		servlet. Webserver reads it from a stream and give it to browser*/
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello from Servlet"); // we are writing stuff to output stream
		out.flush();

		/*now since the webbroswer mostly understands text/html we would have to set the response content type before using 
		response object. response.setContent("text/content") there are several other content types which can
		be found from api*/
	}

	public void destroy(){
		System.out.println("Destroying the servlets");
	}
}
