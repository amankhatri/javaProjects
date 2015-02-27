import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
/*Steps to communicate to the db 
 * 1) Load the connector/Driver from your java code
 * 2) Get the connection or obtain the connection or open the connection to communicate with db
 * 3) Use the connection to communicate wtith db 
 * 4) Close the connection */
public class JDBCApplication {
static Connection conn = null;
static Statement statement = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1) Load the Driver --located in MrSql Server > lib , drive is the name of the class
		 * which is in the jar com.mysql.jdbc.Driver*/
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		/* driver manager class to get connection, Driver manager is a class given by jdbc
		 * to get connection method we need to pass the Database details*/
		
	  try {
		  /*2) get the connection or obtain the connection or oben the connection*/
			JDBCApplication.conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
			         "user=root&password=123456789");
			System.out.println("Connection is sucessfully established");
			/*3) Use the connection to communicate with db.
			 * 3a) now communicate with database to communicate we use statement class for making 
			 * sql comments
			 * 3b) after creating a statement object, we will use that object to execute a query*/
			JDBCApplication.statement =  (Statement) conn.createStatement();
			/*3b) after creating a statement object, we will use that object to execute a query*/
			ResultSet rs = statement.executeQuery("select * from febschema.employee");
			while(rs.next()){
				System.out.println(rs.getString("employeeId"));
				System.out.println(rs.getString("employeeName"));
				System.out.println(rs.getString("employeeAddress"));
				System.out.println(rs.getString("employeeMajor"));
			}
			/*4) Close the connections*/
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
