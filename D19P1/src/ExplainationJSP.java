we always have to follow rules of server which is given by server api
we also want to tell the server where all are files are located 


public class ExplainationJSP {
Servlets life cycle
Initialization - init()
	-the servelet engine loads the servlets*.class file in jvm memory space and initializes any object
Execution - doGet or doPost()
	-when a servlet request is made, a servlet request object is sent with all information about 
	the request
	-a servlet reponse object is used to return the response. 
Destruction - destroy()
	- the servlet cleans up allocated resorces.

Web server is a container that is responsible for reading the request from the browser, and invoke the
right servlet and give it back to the browser. 
 suppose a user clicks on a pyment link on browser, and server gets the request. 
 	1) Next server will invoke init method which will take in formation 
 	like credit card number and name
 	2), and then sever will invoke doGet or Do post, so we have to override
 	one of them. In do get or do post we will write the logic for processing credit card.
 	3) after this the server will send a response to webbrowser. 
 	Next, server will call the destroy method when the servlet will be killed. You can do db close, 
 	and connection close everything in destroy method. 
 	note init and destroy methods are optional
 	
 	
	
}
