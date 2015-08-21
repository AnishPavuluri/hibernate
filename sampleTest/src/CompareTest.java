import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import test.Student;

public class CompareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("xanish reddy");
		student.setNo(45);

		Student student2 = new Student();
		student2.setName("mnish reddy");
		student2.setNo(25);
		System.out.println(student.compareTo(student2));
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student2);
		System.out.println("before sort--->"+list);
		
		Collections.sort(list);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getNo().compareTo(o1.getNo());
			}
		});
		System.out.println("after sort---->"+list);

	}

}
