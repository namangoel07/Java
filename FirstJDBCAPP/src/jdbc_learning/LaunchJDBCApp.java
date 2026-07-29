package jdbc_learning;
import java.sql.*;
public class LaunchJDBCApp {
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{  //load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");	
	//DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //or this is used to load
	
	//establish the connection
	String url="jdbc:mysql://localhost:3306/jdbclearning";
	String user="root";
	String password="Naman@0914";
	Connection connect=DriverManager.getConnection(url,user,password);


	
	//creating statement
	Statement statement=connect.createStatement();
	
	//execute query
	//String sql="INSERT INTO studentinfo(id,sname,sage,scity) VALUES (1,'Rohan',17,'Bengaluru')"
	String sql="INSERT INTO studentinfo(id,sname,sage,scity) VALUES (2,'Rohit',19,'Pune')";
	int rowAffected=statement.executeUpdate(sql);
	System.out.println("Rows affected = " + rowAffected);
	//process the result
	if(rowAffected==0) {
		System.out.println("Unable to insert the data");
	}
	else {
		System.out.println("Data inserted Successfully");
	}
	
	//close the resources
	statement.close();
	connect.close();
	
}
}
