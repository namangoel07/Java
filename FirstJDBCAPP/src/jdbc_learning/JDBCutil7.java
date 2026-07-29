package jdbc_learning;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil7
{

	static {
		//load and register the driver
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}	
	}
	
	public static Connection getConnection() throws SQLException{
		//establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="Naman@0914";
		return DriverManager.getConnection(url,user,password);
	}
	
	public static void closeConnection(Connection connect,Statement statement) throws SQLException {
		statement.close();
		connect.close();
	}
}
