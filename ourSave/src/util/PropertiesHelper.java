package util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {
	
	private static Properties properties = new Properties();
	public static Properties getProperties(String name){
		try {
			properties.load(PropertiesHelper.class.getClassLoader().getResourceAsStream(name));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}
