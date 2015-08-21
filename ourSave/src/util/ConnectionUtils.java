package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtils {
	static Properties properties;
	static{
		properties = PropertiesHelper.getProperties("mapping/cfg.properties");
		try {
			Class.forName(properties.getProperty("driverClassName"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("userName"), properties.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
