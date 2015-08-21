import java.util.Scanner;


public class PrimeTest {
	private int index = 1;
	private int count = 0;
	public static void main(String[] args) {
		PrimeTest p = new PrimeTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		Integer i = sc.nextInt();
		int c = p.checkPrime(i);
		System.out.println("---------->"+c);
		if(c == 2){
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
	
	public Integer checkPrime(Integer i){
		if(i % index == 0){
			count++;
			if(count > 2)
			return count;
		}
		if(index <= i){
			index++;
			checkPrime(i);
		}
		return count;
		
	}

}
