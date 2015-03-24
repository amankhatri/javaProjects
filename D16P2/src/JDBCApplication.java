import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*Steps to communicate to the db 
 * 1) Load the connector/Driver from your java code
 * 2) Get the connection or obtain the connection or open the connection to communicate with db
 * 3) Use the connection to communicate wtith db 
 * 4) Close the connection */
public class JDBCApplication {
	private final static String JDBCPackageName = "com.mysql.jdbc.Driver";
	private final static String connectionString = "jdbc:mysql://localhost/test?" +
			         "user=root&password=123456789";
	private static String sqlStatement = "insert into febschema.employee values(4,'emp4Name','emp4Address','emp4Major')";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*1) Loading the Driver*/
			Class.forName(JDBCPackageName);
			/*2) Getting the connection or opening the connection using the driver*/
			Connection connection = DriverManager.getConnection(connectionString);
			/*3 Talking to data base - Steps 
			 * 	3a) Create Statements- These are used to execute the Statements to Database
			 *  3b) create a sqlStatement - which is just a sql query (sqlStatement)
			 *  3c) Execute Statements*/
			
			/*3a) Using Statements*/
			Statement stat = connection.createStatement();
			/*3b) and 3c)*/
			stat.execute(sqlStatement);
			System.out.println("Sql Statement - query executed successfully");
			/*4) Close the connection*/
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

}
