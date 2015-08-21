import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: Anish
 * Date: 2/9/14
 * Time: 10:08 PM
 */
public class ComparatorAndComparableTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("aaaa");
        student2.setName("AAA");
        student3.setName("BBBB");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setName("bbbbb");
        employee2.setName("bbbbb");
        employee3.setName("bbbbb");
        List list = new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("before : "+list);
        Collections.sort(list, new ComparatorTest());
        System.out.println("After : "+list);

    }
}
