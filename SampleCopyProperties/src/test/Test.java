package test;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import utils.BeanUtils;
import dto.Student;

public class Test {
	public static void main(String[] args) throws Exception {
		Student studentDto = new Student();
		form.Student studentForm = new form.Student();
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(90);
		marks.add(80);
		marks.add(70);
		studentDto.setStudentNo(2);
		studentDto.setStudentName("Anish");
		studentDto.setMarks(marks);
		BeanUtils.copyProperties(studentDto, studentForm);
		System.out.println(studentForm.getStudentNo());
		System.out.println(studentForm.getStudentName());
		for(Integer i : studentForm.getMarks()){
			System.out.println(i);
		}
	}

}
