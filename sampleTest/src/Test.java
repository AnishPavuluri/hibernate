import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter a num");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if((n%2==0)&&(n%1==0))
		{
			System.out.println("its prime");
		}
		else{
			System.out.println("not prime");
		}

	}

}
