package edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.exception.StudentException;
import edu.model.Student;

public class studentDao {
	Connection con;
	PreparedStatement preparedStatement;
	String sql="insert into student values(?,?)";
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public void insertstudent(Student s) throws StudentException {
		try {
			con=getCon();
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,s.getStudentNo());
			preparedStatement.setString(2,s.getStudentName());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new StudentException();
		}
		finally{
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
