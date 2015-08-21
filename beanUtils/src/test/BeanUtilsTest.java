package test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import form.Course;
import form.Student;

public class BeanUtilsTest {
	public static void main(String[] args) {
		Student studentForm = new Student();
		dto.Student studentDto = new dto.Student();
		Course courseForm = new Course();
		dto.Course courseDto = new dto.Course();
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(90);
		marks.add(80);
		marks.add(90);
		courseForm.setCourseNo(1);
		courseForm.setCourseName("JAVA");
		studentForm.setStudentNo(2);
		studentForm.setStudentName("Anish");
		studentForm.setMarks(marks);
		studentForm.setCourse(courseForm);
		try {
			BeanUtils.copyProperties(studentDto, studentForm);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(studentDto.getStudentNo());
		System.out.println(studentDto.getStudentName());
		for(Integer i : studentDto.getMarks()){
			System.out.println(i);
		}
		System.out.println(studentDto.getCourse().getCourseNo());
		System.out.println(studentDto.getCourse().getCourseName());

	}

}
