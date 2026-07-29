package jdbc_learning;
import java.sql.*;
public class LaunchApp8 {
public static void main(String[] args) {
	Connection connect=null;
	Statement statement=null;
	try {
		connect=JDBCutil7.getConnection();
		//creating statement
		statement=connect.createStatement();
		//execute query
		String sql="INSERT INTO studentinfo(id,sname,sage,scity) VALUES (4,'Virat',42,'Delhi')";
		int rowAffected = statement.executeUpdate(sql);
		//process the result
		if(rowAffected==0) {
			System.out.println("Not Updated");
		}
		else {
			System.out.println("Updated ");
		}
		}
	
       catch (SQLException e) {
	         e.printStackTrace();
                   }
       catch(Exception e) {
	    e.printStackTrace();
                 }
	finally {
		try {
			JDBCutil7.closeConnection(connect, statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
}

