/**
 * Created by IntelliJ IDEA.
 * User: Anish
 * Date: 2/9/14
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
