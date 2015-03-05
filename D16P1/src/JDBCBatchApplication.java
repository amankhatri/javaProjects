import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;


public class JDBCBatchApplication {
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String JDBC_SERVER = "jdbc:mysql://localhost/test?";
		static final String JDBC_LOGIN = "user=root&password=123456789";
	
		static Connection conn = null;
		static Statement statement = null;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			/*if you have millions of commands to be run using sql via java, i should do that
			 * in batches, everytime we execute a commands , unless autocommit = true, 
			 * the edits in db won't be stored. This can be used to create batches of
			 * commands and sent to db by using commit. there are two main db commands 
			 * which are commonly used, they are commit and roll back */ 
				/*Asssume there are 10 records which you need to insert in db, and 
				 * for some reason db goes done while inserting 9th entry, then you may
				 * have a requirement in project, that may insert all values or none. 
				 * To implement this scenario, use commit command after executing all 
				 * the insert are executed 
				 * connection.rollback will roll back the records inserted into the database
				 * Connection.commit will same values to database parmanently*/
				
				 try {
						Class.forName(JDBC_DRIVER);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				 try {
					JDBCBatchApplication.conn = DriverManager.getConnection(JDBC_SERVER + JDBC_LOGIN);
					JDBCBatchApplication.statement =  (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}


