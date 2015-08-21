package prime;

import java.util.Scanner;

public class PrimeTestNth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number::");
		int n = sc.nextInt();		int count = 0;
		int i = 1;
		while(count < n){
			int c=0;
			for(int j=2; j<=i; j++){
				if(i%j==0){
					c++;
				}
			}
			if(c==1){
				count++;
			}
			if(n!=count)
			i++;
		}
		System.out.println(i);

	}

}
