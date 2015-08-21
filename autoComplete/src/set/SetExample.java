package set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		Employee e1 = new Employee();
		e1.setNo(1);
		e1.setName("rama");
		Employee e2 = new Employee();
		e2.setNo(1);
		e2.setName("rama");
		set.add(e1);set.add(e2);
		System.out.println(set);

	}

}
