package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class M_Manager {
	public ResultSet viewSales() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
			Statement stmt = con.createStatement();
			String query = "Select Sale From sale";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e){System.out.println(e);}
		
		return null;
	}
	
}
