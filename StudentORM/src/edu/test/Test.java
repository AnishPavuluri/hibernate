package edu.test;
import edu.session.Session;

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
public class Test{
	public static void main(String args[]) throws IOException, SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Session session=new Session();
		Student student=new Student();
		student.setStudentNo("3");
		student.setStudentName("n@it");
		session.save(student);
	    System.out.println("record inserted success fully");	
	
	}
	
}

