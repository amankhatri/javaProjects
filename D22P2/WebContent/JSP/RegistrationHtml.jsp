<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
/*In JSP we don't have doget or do post methods. JSP uses implicit objects

We have implesic objects
1) Page
2) Request - THis is an object of class httpservletRequest which is a ready made object (Implicit object). 
3) Sessions
*/
String name = request.getParameter("nam");
String email = request.getParameter("eid");
String education = request.getParameter("edu");
System.out.println(name);
testMethod();

%>

<h2>
Hello <%=email %>
</h2>

<%! public void testMethod(){
	System.out.println("Write Java methods here");
}
%>

Storing a string to the Session variable
<br>
Name: <% session.setAttribute("nam",request.getAttribute("nam"));%>
<br>
Retrieving the string from session variable
<b>Name:</b><%=session.getAttribute("nam") %>
<br>



</body>
</html>