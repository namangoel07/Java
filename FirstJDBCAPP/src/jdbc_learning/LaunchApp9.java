package jdbc_learning;
import java.sql.*;
import java.util.Scanner;
public class LaunchApp9 {
public static void main(String[] args) {
	Connection connect=null;
	PreparedStatement pstate=null;
	try {
	//connection
	connect=JDBCutil7.getConnection();
	//prepared statement and executing query
	//statement=connect.createStatement();
	String query="INSERT INTO studentinfo (id,sname,sage,scity) VALUES (?,?,?,?)";
	 pstate=connect.prepareStatement(query);
	 
	 System.out.println("Please enter the following details to be stored in DB");
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter your id");
	 Integer id=in.nextInt();
	 
	 System.out.println("Enter Your Name");
	 String name=in.next();
	 
	 System.out.println("Enter your age");
	 Integer age=in.nextInt();
	 
	 System.out.println("Enter your city");
	 String city=in.next();
	 
	 pstate.setInt(1, id);
	 pstate.setString(2, name);
	 pstate.setInt(3, age);
	 pstate.setString(4, city);
		
	int rowAffected=pstate.executeUpdate();
	//process the result
	if(rowAffected==0) {
		System.out.println("Unable to insert the data");
	}
	else {
		System.out.println("Data is updated");
	}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			JDBCutil7.closeConnection(connect, pstate);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
}
