package edu.session;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import edu.model.Student;
public class Session {
	private Connection con,con1;
	Properties mappingProperties;
	PreparedStatement  ps,ps1;
	public void save(Object object) throws IOException, SQLException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException{	
		mappingProperties=new Properties();
		mappingProperties.load(Session.class.getClassLoader().getResourceAsStream("hibernate.cfg.properties"));
		String classname=mappingProperties.getProperty("driverclassname");
		String url=mappingProperties.getProperty("cs");
		String userName=mappingProperties.getProperty("username");
		String password=mappingProperties.getProperty("password");
		Class c=Class.forName(classname);
		con=DriverManager.getConnection(url,userName,password);
		String className=object.getClass().getName();
		Field[] fields=object.getClass().getDeclaredFields();
		mappingProperties.load(Session.class.getClassLoader().getResourceAsStream("student.hbm.properties"));
		Map<String, String> fieldMap=new HashMap<String, String>();
		for(Field f:fields){
			fieldMap.put(f.getName(),mappingProperties.getProperty(f.getName()) );
		}
		String s=null;
		String tableName=mappingProperties.getProperty(className);
		Method[] method=object.getClass().getDeclaredMethods();
		String x="?";
		for(int k=1;k<fields.length;k++){
			x=x+",?";
		}
		String query="insert into "+tableName+" values("+x+")";
		ArrayList<String> methodValues=new ArrayList<String>();
		for(Method m:method)
		{
		if(m.getName().contains("get")){
		    s=(String) m.invoke(object,null);
		    methodValues.add(s);
			}
		}
		System.out.println(x);
		ps=con.prepareStatement(query);
		for(int i=1;i<=methodValues.size();i++){
			ps.setString(i,methodValues.get(i-1));
		}
		ps.executeUpdate();
		ps.close();
		con.close();
	}
}
