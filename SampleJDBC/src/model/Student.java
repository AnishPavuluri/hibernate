package model;

public class Student {
	private int no;
	private String name;
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	/*public boolean equals(Object s1) {
		Student s=(Student)s1;
		boolean b1=Integer.valueOf(this.no).equals(s.no);
		boolean b2=this.name.equals(s.name);
		if(b1&&b2){
			return true;
		}
		else{
			return false;
		}
	}*/
	@Override
	public String toString() {
		return "name=" + name + " no=" + no ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	

}
