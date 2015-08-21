import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

public class DbSrv extends HttpServlet {

	Connection con=null;
	PreparedStatement ps;
	String s2,s3,s4;
	public void init() throws ServletException {
		// Put your code here
		ServletContext sc=getServletContext();
		String s1=sc.getInitParameter("driver");
		 s2=sc.getInitParameter("url");
		 s3=sc.getInitParameter("dbuser");
		 s4=sc.getInitParameter("dbpwd");
	try{
		
		Class.forName(s1);
		con=DriverManager.getConnection(s2,s3,s4);
	
	}
		
	
	 catch (Exception e1) {
		// TODO: handle exception
		 e1.printStackTrace();
	}
	}	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try
		{	
			ps=con.prepareStatement("select sno,sname,sadd from student");
			ResultSet rs=ps.executeQuery();
			List<Student> studentList = new ArrayList<Student>();
			Student student = null;
			while(rs.next())
			{
				student = new Student();
				student.setStudentNo(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setStudentAddress(rs.getString(3));
				studentList.add(student);
				
			}
			request.setAttribute("studentList", studentList);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			rs.close();
			ps.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	@Override
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
	

}
