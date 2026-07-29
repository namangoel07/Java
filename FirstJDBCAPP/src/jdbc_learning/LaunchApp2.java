package jdbc_learning;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LaunchApp2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//Load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//establish the connection
	String url="jdbc:mysql://localhost:3306/jdbclearning";
	String user="root";
	String password="Naman@0914";
	Connection connect1=DriverManager.getConnection(url,user,password);
	//creating statement
	Statement statement=connect1.createStatement();
	//retrieving data is select operation and adding,updating , deleting the data are selective operations
	
	//executing query
	String sql="UPDATE studentinfo SET sage=24 WHERE id=1";
	int rowAffected=statement.executeUpdate(sql);
	
	
	//process the result
	if(rowAffected==0) {
		System.out.println("Updation failed");
	}
	else {
		System.out.println("Update Successfull"+rowAffected);
	}
	
	//close the resources
	statement.close();
	connect1.close();
	
}
}
