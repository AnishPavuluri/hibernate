
public class Test {
	private int color=2;
	public static void main(String... s){
		Test t=new Test();
		t.color=3;
		System.out.println(t.color);
		Test t1 = new Test();
		t1.test();
	}
	
	public void test(){
		System.out.println("--------->"+color);
	}
}
