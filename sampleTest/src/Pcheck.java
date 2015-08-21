import java.util.Scanner;

class Pcheck {
  public static void main(String[] args) {
	  System.out.println("eneter n");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int i;
	  int count=1;
	  for(int j=1;j<num;j++){
		  
  for (i=2; i < j ;i++ ){
  int n = j%i;
  
  }
  if(i == j){
	  count++;
	  if(count==num)
  System.out.println(j);
  }
  }
}}