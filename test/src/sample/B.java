package sample;

public class B extends A {
	
	public void run(){
		System.out.println("B :: run");
	}
	
	public static void main(String[] args) {
		A b = new B();
		b.start();
		
	}

}
