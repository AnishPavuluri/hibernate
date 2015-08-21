import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

public class ManipulateStudent extends HttpServlet {

	Connection con = null;
	PreparedStatement ps;

	public void init() throws ServletException {
		// Put your code here
		ServletContext sc = getServletContext();
		String s1 = sc.getInitParameter("driver");
		String s2 = sc.getInitParameter("url");
		String s3 = sc.getInitParameter("dbuser");
		String s4 = sc.getInitParameter("dbpwd");
		try {

			Class.forName(s1);
			con = DriverManager.getConnection(s2, s3, s4);

		}

		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String operation = request.getParameter("x");
		if (operation.equalsIgnoreCase("ADD")) {
			RequestDispatcher rd = request.getRequestDispatcher("myjsp.jsp");
			rd.forward(request, response);

			
		} else if (operation.equalsIgnoreCase("EDIT")) {
			int s8=Integer.parseInt(request.getParameter("sno"));
			try {
				ps=con.prepareStatement("select sno,sname,sadd from student where sno=?");
				ps.setInt(1,s8);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
				Student student = new Student();
				student.setStudentNo(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setStudentAddress(rs.getString(3));
				request.setAttribute("s", student);
				}
				request.getRequestDispatcher("myjsp.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		} else if (operation.equalsIgnoreCase("DELETE")){
			int s5=Integer.parseInt(request.getParameter("sno"));
			try {
				ps=con.prepareStatement("delete from student where sno=?");
				ps.setInt(1, s5);
				int d=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if(operation.equalsIgnoreCase("saveStudent")){
			 int s5=Integer.parseInt(request.getParameter("sno"));
			 String s6=request.getParameter("sname");
			 String s7=request.getParameter("sadd"); 
			 try {
				ps=con.prepareStatement("insert into student (sno,sname,sadd) values(?,?,? )");
				ps.setInt(1,s5); 
				ps.setString(2, s6);
				ps.setString(3, s7);
				ps.executeQuery();
				con.commit();
				//request.getRequestDispatcher("/dburl").forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		 
		if(operation.equalsIgnoreCase("editStudent")){
			 int s5=Integer.parseInt(request.getParameter("sno"));
			 String s6=request.getParameter("sname");
			 String s7=request.getParameter("sadd"); 
			 try {
				ps=con.prepareStatement("update student set sname=?,sadd=? where sno=?");
				ps.setInt(3,s5); 
				ps.setString(1, s6);
				ps.setString(2, s7);
				int a=ps.executeUpdate();
				con.commit();
				//request.getRequestDispatcher("/dburl").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		 
	}

}
