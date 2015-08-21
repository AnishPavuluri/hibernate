package prime;

import java.util.Scanner;

public class NthPrime {

	
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number::");
		int n = sc.nextInt();
		for(int i = 1; count < n; i++){
			int c = 0;
			for(int j = 2; j <= i; j++){
				if(i % j == 0){
					c++;
				}
				if(c == 1){
					count++;
				}else if (c > 1) {
					break;
				}
			}
			if(count == n){
				System.out.println(n+" th prime number is :: "+i);
			}
		}

	}

}
