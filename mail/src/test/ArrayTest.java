package test;

public class ArrayTest {
	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println(a.length);
		System.out.println(findRoot());
	}
	
	public static int findRoot(){
		try{
			System.out.println("in try");
			return 1;
		}catch (Exception e) {
			System.out.println("in catch");
		} finally{
			System.out.println("in finally");
	//		return 2;
		}
		return 0;
	}

}
