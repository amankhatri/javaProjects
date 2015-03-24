import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

/*Steps to communicate to the db 
 * 1) Load the connector/Driver from your java code
 * 2) Get the connection or obtain the connection or open the connection to communicate with db
 * 3) Use the connection to communicate with db 
 * 4) Close the connection */
public class JDBCApplication {
	private final static String JDBCPackageName = "com.mysql.jdbc.Driver";
	private final static String connectionString = "jdbc:mysql://localhost/test?" +
			         "user=root&password=123456789";
	static String answer = null;
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
			/*Preparedstatements tells to prepare statement for execution.
			 * each ? passed as an argument of the prepareStatement has an index associated with it. 
			 * it starts from 1 . */
			PreparedStatement preparedStat = connection.prepareStatement("insert into febschema.employee values(?,?,?,?)");
			do {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Please enter Employee ID");
				int empId = scanner.nextInt();
				System.out.println("Please enter Employee Name");
				String empName = scanner.next();
				System.out.println("Please enter Employee Address");
				String empAdd = scanner.next();
				System.out.println("Please enter Employee Major");
				String empMajor = scanner.next();
				preparedStat.setInt(1, empId);
				preparedStat.setString(2, empName);
				preparedStat.setString(3, empAdd);
				preparedStat.setString(4, empMajor);
				preparedStat.execute();
				System.out.println("Do you want to continue - Yes/No");
				answer = scanner.next();
			} while (answer.equals("Yes"));
				
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