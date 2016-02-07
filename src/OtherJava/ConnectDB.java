package OtherJava;

import java.sql.*;


public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		
		     Statement stmt = con.createStatement();
		     
		     ResultSet rs = stmt.executeQuery("select * from compan.employee");
		     
		     while(rs.next()){
		    	 System.out.println((rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)));
		    con.close();
		     }
		     
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    

	}

}
