package edu.service;
import java.sql.Connection;
import java.sql.SQLException;
import edu.dao.studentDao;
import edu.exception.StudentException;
import edu.model.Student;
import edu.util.ConnectionUtil;
public class StudentService {
    studentDao studentdao =new studentDao();
    
	public void insertStudent(Student s) throws StudentException {
		Connection con=null;
		try{
	    con=ConnectionUtil.getConnection();
		studentdao.setCon(con);
		if(s.getStudentNo()==null)
			throw new StudentException();
	
		studentdao.insertstudent(s);
		}
		catch (StudentException e) {
			throw new StudentException();
		}
		finally{
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		}
	}
	
	


}
