package edu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.exception.StudentException;
import edu.model.Student;
import edu.service.StudentService;

public class StudentServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student s=new Student();
		s.setStudentNo(request.getParameter("studentNo"));
		s.setStudentName(request.getParameter("studentName"));
		StudentService studentService=new StudentService();
		RequestDispatcher rd;
		
		try {
			if(request.getParameter("studentNo")==""||request.getParameter("studentName")=="")
				throw new StudentException();
			studentService.insertStudent(s);
			rd=request.getRequestDispatcher("success.jsp");
		} catch (StudentException e) {
			rd=request.getRequestDispatcher("failure.jsp");
		}
		
		rd.forward(request, response);
		
			
	}

	
}
