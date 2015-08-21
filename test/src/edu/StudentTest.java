package edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentNo(2);
		s1.setStudentName("abid");
		Student s2 = new Student();
		s2.setStudentNo(1);
		s2.setStudentName("ramana");
		Student s3 = new Student();
		s3.setStudentNo(1);
		s3.setStudentName("najeeb");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);list.add(s2);list.add(s3);
		System.out.println(list);
		for(Student s:list){
			System.out.println(s.getStudentName());
		}
		System.out.println("--------------");
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getStudentNo().equals(o2.getStudentNo())){
					return o1.getStudentName().compareTo(o2.getStudentName());
				}else{
					return o1.getStudentNo().compareTo(o2.getStudentNo());
				}
			}
		});
		for(Student l : list){
			System.out.println(l.getStudentName());
		}
	}
}
