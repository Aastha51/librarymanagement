package lms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MydbConnectionClass {
	public static Connection getConnection() {
		Connection con=null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root@1");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		 }
}
