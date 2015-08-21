package najeeb;

public class SampleString {

	public static void main(String[] args) {
		String a = new String("Anish");
		String b = new String("anish");
		System.out.println(a.equals(b));
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println("a-->"+a+"-b-"+b+"--a.hashcode()-->"+a.hashCode()+"--b.hashcode()-->"+b.hashCode());

	}

}
