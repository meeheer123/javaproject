package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class M_Customer {
	
	public void rateService(String customerId, String rate) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = con.createStatement();
			String sql = "Update customer Set rate = '"+ rate +"' Where Customer_ID = '" + customerId + "'"; 
			int a = stmt.executeUpdate(sql);
			
		
		}catch(Exception e) {System.out.println(e);}
	}
}
