package jdbc_learning;
import java.sql.*;
public class LaunchApp5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Establish the connection
	String url="jdbc:mysql://localhost:3306/jdbclearning";
	String user="root";
	String password="Naman@0914";
	Connection connect5=DriverManager.getConnection(url,user,password);
	//creating statement
	Statement statement5=connect5.createStatement();
	//execute query
	//String sql="SELECT * FROM studentinfo"; //select query
	String sql="UPDATE studentinfo SET sage=18 WHERE id=1";
	boolean status=statement5.execute(sql);//if you are passing not select query like updation,insertion ,deletion it will give u false
	//process the result
	if(status) {
		//select query-> retrieval
		System.out.println("IF block");
		ResultSet rs1=statement5.getResultSet();
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getString(4));
		}
	}
	else{
		//insert,updation,delete
		System.out.println("Else block");
		int rows=statement5.getUpdateCount();
		if(rows==0) {
			System.out.println("Operation failed");
		}
		else{
			System.out.println("Operation Successfull");
		}
		
	}
	//close the resources
	statement5.close();
	connect5.close();
}
}
