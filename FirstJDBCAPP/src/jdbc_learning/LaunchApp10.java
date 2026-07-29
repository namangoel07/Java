package jdbc_learning;
import java.sql.*;
import java.util.Scanner;
public class LaunchApp10 {
public static void main(String[] args) {
	Connection connect=null;
	PreparedStatement pstate1=null;
	try {
		connect=JDBCutil7.getConnection();
		String query="UPDATE studentinfo SET sage=? WHERE id=?";
        //for delete just write delete query
		pstate1=connect.prepareStatement(query);
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the data u want to update");
		System.out.println("Enter id");
		Integer id=in.nextInt();
		System.out.println("Enter updated age");
		Integer age=in.nextInt();
		
		pstate1.setInt(2, id);
		pstate1.setInt(1, age);
		
		int rowAffected=pstate1.executeUpdate();
		if(rowAffected==0) {
			System.out.println("Unable to update ");
			
		}
		else {
			System.out.println("Update success");
			
		}
		
			
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			JDBCutil7.closeConnection(connect, pstate1);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
}
