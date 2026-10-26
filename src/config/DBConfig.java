package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	public static Connection getConnection(String driver_class, String url, 
			String user, String pwd) {
		Connection con = null;
		try {
			Class.forName(driver_class);
			System.out.println("Driver Found....");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connected with Database ");
		} catch (ClassNotFoundException e) {
			System.err.println("Unable to find the Driver Class");
		} catch (SQLException e) {
			System.err.println("Unable to Connect with the DataBase");
		}
		return con;
	}
}
