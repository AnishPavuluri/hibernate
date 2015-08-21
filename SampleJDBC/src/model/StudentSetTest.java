package model;

import java.util.HashSet;
import java.util.Set;

public class StudentSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Student> students = new HashSet<Student>();
		Student s1 = new Student(1, "abid");
		Student s2 = new Student(27, "najeeb");
		Student s3 = new Student(1, "abid");
		String str1=new String("najeeb");
		String str2=new String("najeeb");
		Set<String> set=new HashSet<String>();
		set.add(str1);
		set.add(str2);
		System.out.println(set.toString());
		System.out.println(str1.equals(str2));
		System.out.println(s3.equals(s1));
		students.add(s1);students.add(s2);students.add(s3);
		System.out.println(students);
		/*Set<String> set=new HashSet<String>();
		set.add("anish");
		set.add("najeeb");
		set.add("anish");
		System.out.println(set.toString());*/
		

	}

}
