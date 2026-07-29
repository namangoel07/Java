package jdbc_learning;
import java.sql.*;
public class LaunchApp12 {
public static void main(String[] args) {
	Connection connect=null;
	PreparedStatement pstate=null;
	try {
		connect=JDBCutil7.getConnection();
		
		String query="UPDATE studentinfo SET sage=? WHERE id=?";
		pstate=connect.prepareStatement(query);
		
		pstate.setInt(1, 20);
		pstate.setInt(2, 1);
		pstate.addBatch();
		pstate.setInt(1, 45);
		pstate.setInt(2, 55);
		pstate.addBatch();
	    pstate.executeBatch();
	    System.out.println("Data is updated check the sql");
		
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
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
