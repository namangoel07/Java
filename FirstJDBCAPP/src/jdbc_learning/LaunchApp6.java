package jdbc_learning;
import java.sql.*;
public class LaunchApp6 {
public static void main(String[] args) {
	Connection connect6=null;
	Statement statement6=null;
	
	try {
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	//establish the connection
	String url="jdbc:mysql://localhost:3306/jdbclearning";
	String user="root";
	String password="Naman@0914";
	connect6 = DriverManager.getConnection(url,user,password);
	//creating statement 
		statement6=connect6.createStatement();
	//execute query
	String sql="INSERT INTO studentinfo(id,sname,sage,scity) VALUES (3,'Roki',40,'Delhi')";
	int rowAffected=0;
	rowAffected = statement6.executeUpdate(sql);
	//process the result
	if(rowAffected==0) {
		System.out.println("Not Updated");
	}
	else {
		System.out.println("Updated ");
	}
	}
   catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	//closing resources
		finally {
			try {
				statement6.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connect6.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}

}
	
	
	
	
}
}
