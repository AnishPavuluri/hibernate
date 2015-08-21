package test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String a = "a";
		String b = "b";
		String c = new String("c");
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(list);
		c=new String("ram");
		System.out.println(list);
		List<Student> list1 = new ArrayList<Student>();
		Student s1 = new Student(1, "rama");
		Student s2 = new Student(2, "sitha");
		list1.add(s1);
		list1.add(s2);
		System.out.println(list1);
		
		list1.get(1).setName("Hanuman");
		System.out.println(list1);

	}

}
