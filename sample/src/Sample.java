
public class Sample {
	public void m1(int i){
		i=20;
	}
	public void m2(StringBuffer s){
		s = new StringBuffer("aparao");
		s.append("bye bye");
	}
	public void m3(Student s){
		s = new Student();
		s.setName("qwe");
		s.setNo(2);
	}
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		int i = 10;System.out.println(i);
		sample.m1(i);
		System.out.println(i);
		StringBuffer stringBuffer = new StringBuffer("hai");
		System.out.println(stringBuffer);
		sample.m2(stringBuffer);
		System.out.println(stringBuffer);
		Student student = new Student();
		student.setNo(1);
		student.setName("abc");
		System.out.println(student);
		sample.m3(student);
		System.out.println(student);

	}

}
