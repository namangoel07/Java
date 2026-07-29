package jdbc_learning;
import java.sql.*;
public class LaunchApp4 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//establish connection
	String url="jdbc:mysql://localhost:3306/jdbclearning";
	String user="root";
	String password="Naman@0914";
	Connection connect4=DriverManager.getConnection(url,user,password);
	//creating statement
	Statement statement4=connect4.createStatement();
	//execute query
	String sql="DELETE FROM studentinfo WHERE id=2";
	int rowAffected=statement4.executeUpdate(sql);
	//process the result
	if(rowAffected==0) {
		System.out.println("Not updated");
	}
	else {
		System.out.println("updated");
	}
	//close the resources
	connect4.close();
	statement4.close();
}
}
