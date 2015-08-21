public class DebugTest {
	public static void main(String[] args) {
		int a=4,b=4;
		System.out.println("Break point-f5");
		add(a,b);
		System.out.println("Break point-f5");
		sub(a,b);
		System.out.println("Break point-f8");
		System.out.println("success");
		System.out.println("watch expression->add(a8b)->f8");
	}
	public static void add(int a,int b) {
		System.out.println("Break point -f6");
		System.out.println("variables window and change the variable value");
		int sum=a+b;
		System.out.println("inspectly-verify 'a' value--->select a ctrl+shift+l");
		System.out.println("sum"+sum);
	}
	public static void  sub(int a,int b) {
		System.out.println("break point-f7");
		int sub=a-b;
		System.out.println("sub"+sub);
	}
}
