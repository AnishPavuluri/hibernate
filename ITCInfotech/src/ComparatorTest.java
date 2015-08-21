import java.util.Comparator;

/**
 * User: Anish
 * Date: 2/9/14
 * Time: 10:14 PM
 */
public class ComparatorTest implements Comparator {

    public int compare(Object o1, Object o2) {
        Employee employee1 = null;
        Employee employee2 = null;
        Student student1 = null;
        Student student2 = null;
        if(o1 instanceof Employee) {
            employee1 = (Employee)o1;
        }
        if(o2 instanceof Employee) {
            employee2 = (Employee)o2;
        }
        if(o1 instanceof Student) {
            student1 = (Student)o1;
        }
        if(o2 instanceof Student) {
            student2 = (Student)o2;
        }
        if (null != employee1 && null != employee2) {
            return employee1.getName().compareTo(employee2.getName());
        } else if(null != employee1 && null != student2) {
            return employee1.getName().compareTo(student2.getName());
        } else if(null != student1 && null != employee2) {
            return student1.getName().compareTo(employee2.getName());
        } else {
            return student1.getName().compareTo(student2.getName());
        }

    }
}
