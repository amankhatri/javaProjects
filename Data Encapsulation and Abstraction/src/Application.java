/*data encapsulation:
 * Wrapping up of the data into a single unit and projecting required data to the outer world.
 * hiding the data 
 * To hide the data we will use Access Modifiers (Public, Private, Protected, Default ) these 
 * can be used at variable levels as well as method levels. default is Private, when nothing 
 * is specified.
 * 
 * Data Abstraction:
 * Hiding the internal implementation details from the end user is said to be abstraction. 
 * or hidding the internal implementation complexity from the end user.
 * 
 * 
 * Access Modifiers:  Access modifiers lets you set the access to a variable or a method
 * from these areas:
 * [ same package, within same class, within sub class, or within other class
 * inside the same package ] [other package with in sub class and within other classes]
 * 
 * 1) Private , it can be accessed in same package, within same class and  not within sub classes, 
 * but no with in other class in same package and not in any other pacakage
 * 
 * 2) Default: it can be accessed within same cass, within sub class, within other class in same
 * pacakage, however, it is not acceable to other pacakages.
 * 
 * 3) Protected, it can be acces in same packages, within same class, with in sub class and within
 * other class, also it can be accessed in other packages but within sub class, but not in other 
 * class in other packages,
 * 
 * 4) public , can be accessed by any packages
 * 
 * we will be doing data hiding by applying this access modifiers at variable lever, method 
 * leave depending upon your programming requirements.
 * 
 * Scenario:  
 * ON client side
 * reg.html
 * I want to enter
 * empId
 * empFname
 * empLname
 *  to a total of 20 fields
 *  you should also have {register button] and [Reset button]
 *  
 *  
 *  and on the webeserver we have a controller Registration servlet which is a core java class
 *  so it is RegistrationSrvlet.java class. The data is send to server by get or post request
 *  on press of button
 *  to get data to server we can do String empId = req.getParameter("empId");
 *  and 20 more data types and studd
 *  
 *  now you can register the data and populate the Oracle Data employee table, 
 *  however before entring data to data base we need data validation part before populating
 *  the data base. For this purpose we will have a seperate class let us say it is
 *  EmployeeDAO.Java , and we will have
 *  a file (public boolean registerEmployee() in which i am writing jdbc code and running 
 *  sql query to populate the data base This is buisness logic
 *  
 *  In this application we are passing 20 messages, since the registration has 20 fields
 *  and we will have a seperate class for vall
 *  
 * */


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
