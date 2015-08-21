package test;

import java.util.ArrayList;
import java.util.List;

public class Fibbinaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integer = new ArrayList<Integer>();
		long a=1, b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i <=48 ; i++){
			long c = a + b;
			a=b;
			b=c;
			/*a = a + b ;
			b = a;
			a = b - a;
			System.out.println("a:" +a); //2
			System.out.println("b:" +b); //2*/
			System.out.println(c);
		}
		 a = a +1 ;
		 
		

	}

}
