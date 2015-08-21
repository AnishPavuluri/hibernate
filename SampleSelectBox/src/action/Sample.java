package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dto.Student;
import dto.StudentDAO;

public class Sample extends ActionSupport{
	private List<Long> studentNos;
	private Long studentNo;
	
	public String findStudentNo(){
		System.out.println("----------------------");
		StudentDAO studentDAO = new StudentDAO();
		List<Student> studentList = studentDAO.findAll();
		studentNos = new ArrayList<Long>();
		for(Student s : studentList){
			studentNos.add(s.getSno());
		}
		return SUCCESS;
	}
	
	

	public String getStudentNoFromSelectBox(){
		System.out.println("###################3");
		System.out.println("--- studentNo ---------------->>>"+studentNo);
		return SUCCESS;
	}

	public List<Long> getStudentNos() {
		return studentNos;
	}

	public void setStudentNos(List<Long> studentNos) {
		this.studentNos = studentNos;
	}

	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}

	public Long getStudentNo() {
		return studentNo;
	}
	
	
	

}
