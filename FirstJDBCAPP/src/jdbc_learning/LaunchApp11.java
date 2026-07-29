package jdbc_learning;
import java.sql.*;
import java.util.Scanner;
public class LaunchApp11 {
public static void main(String[] args) {
	Connection connect=null;
	PreparedStatement pstate2=null;
	ResultSet rs=null;
	try {
		connect=JDBCutil7.getConnection();
		String query="SELECT id,sname,sage,scity FROM studentinfo WHERE id=?";
		pstate2=connect.prepareStatement(query);
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter id user to be retreive:");
		Integer id=in.nextInt();
		pstate2.setInt(1, id);
		
	  rs=pstate2.executeQuery();
	  if(rs.next()) {
		    Integer sid=rs.getInt(1);
		    String name=rs.getString(2);
		    Integer sage=rs.getInt(3);
		    String city=rs.getString(4);
		    System.out.println(sid+" "+name+" "+sage+" "+city);
	  }
	  else {
		  System.out.println("There is no record with id"+id);
	  }
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	finally {
		try {
			JDBCutil7.closeConnection(connect, pstate2);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
}
