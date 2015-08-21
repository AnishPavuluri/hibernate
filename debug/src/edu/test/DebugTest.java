package edu.test;

public class DebugTest {
    	public static void main(String[] args) {
		int a=4,b=4;
		System.out.println("Break Point--F5");
		add(a,b);
		System.out.println("Break Point--F5");
		sub(a,b);
		System.out.println("Break Point--F8");
        System.out.println("SUCCESS");
        System.out.println("Watch-Expression-->add(a*b)-->F8");
        
	}

	private static void add(int a, int b) {
		System.out.println("Break Point --F6");
		System.out.println("->variables window and change the variable value");
		int sum=a+b;
		System.out.println("Inspect-Verify 'a' Value->select a (Ctrl+shift+I)");
		System.out.println("sum :"+sum);
	}

	private static void sub(int a, int b) {
		System.out.println("Break Point - F7");
		int sub=a-b;
		System.out.println("sub :"+sub);
		
	}

}
