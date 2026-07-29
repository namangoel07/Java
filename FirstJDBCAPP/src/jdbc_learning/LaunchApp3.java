package jdbc_learning;
import java.sql.*;
public class LaunchApp3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//load and register
	Class.forName("com.mysql.cj.jdbc.Driver");
	//establish the connection
	
	String url="jdbc:mysql://localhost:3306/jdbclearning";
	String user="root";
	String password="Naman@0914";
	Connection connect3=DriverManager.getConnection(url,user,password);
	
	//Creating statement
	Statement statement3=connect3.createStatement();
	//executing the query
	String sql="SELECT * FROM studentinfo";
	ResultSet rs=statement3.executeQuery(sql);//for retrieving we use execute query method
	//process the result
	while(rs.next()) {
		//int id=rs.getInt(1);
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		
		System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity"));
		
	}
	//close the resources
	rs.close();
	connect3.close();
	statement3.close();
}
}
