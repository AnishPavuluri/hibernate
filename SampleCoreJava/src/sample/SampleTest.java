package sample;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class SampleTest {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(200, 200);
		
		Vector<String> vectorHead = new Vector<String>();
		vectorHead.add("EMP NO");
		vectorHead.add("EMP NAME");
		vectorHead.add("EMP ADDRESS");
		Vector<Employee> vectorEmployees = new Vector<Employee>();
		Employee employee = new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("Rama");
		employee.setAddress("Nellore");
		vectorEmployees.add(employee);
		JTable jTable = new JTable(vectorEmployees, vectorHead);
		JTableHeader j = new JTableHeader();
		jFrame.add(jTable);
		jFrame.setVisible(true);
	}
}
