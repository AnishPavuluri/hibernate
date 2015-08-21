package edu.util;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class ConnectionUtil {
	static Connection con=null;
	static String drivername=null;
	static String url=null;
	static String username=null;
	static String password=null;
	static{
		Properties properties=new Properties();
		try {
			properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db-details.properties"));
			 drivername = properties.getProperty("drivername");
			 url=properties.getProperty("url");
			 username=properties.getProperty("username");
			password=properties.getProperty("password");
			Class.forName(drivername);
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			
		}
	}
	public static Connection getConnection() {
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
