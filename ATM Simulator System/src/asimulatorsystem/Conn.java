package asimulatorsystem;

import java.sql.*;

public class Conn {

	
	//public static void main(String[] args) {
		Connection c;
		Statement s;
		
		public Conn() {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				c = DriverManager.getConnection("jdbc:mysql:///project1", "root","");
				s = c.createStatement();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
//}