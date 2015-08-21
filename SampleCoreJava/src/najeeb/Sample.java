package najeeb;

public class Sample {

	public static void main(String[] args) {
		String str=new String("Anish");
		String str1=new String("anish");
		String str2 = new String("anish");
		System.out.println("str --------->"+str.hashCode());
		System.out.println("str1--------->"+str1.hashCode());
		System.out.println("st3----->"+str2.hashCode());
		if(str.equals(str1))
			System.out.println("yes");
		else
			System.out.println("NO");

	}

}
