package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empno;
	private String name;
	private Double salary;
	private Byte deptno;
	private PerminentAdd perminentAdds;
	private Set<TempAdd> tempAdd = new HashSet<TempAdd>() ;

	// Constructors

	
	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer empno) {
		this.empno = empno;
	}

	
	// Property accessors

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Byte getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Byte deptno) {
		this.deptno = deptno;
	}

	public PerminentAdd getPerminentAdds() {
		return perminentAdds;
	}

	public void setPerminentAdds(PerminentAdd perminentAdds) {
		this.perminentAdds = perminentAdds;
	}

	public Set<TempAdd> getTempAdd() {
		return tempAdd;
	}

	public void setTempAdd(Set<TempAdd> tempAdd) {
		this.tempAdd = tempAdd;
	}
	

	

}