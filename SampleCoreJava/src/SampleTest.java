import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sample.Emplaoyee;


public class SampleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Emplaoyee> emplaoyees = new ArrayList<Emplaoyee>();
		int s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. add");
		System.out.println("2. Edit");
		System.out.println("3. Delete");
		System.out.println("4. show");
		while(true){
		System.out.println("enter your choice");
		switch (scanner.nextInt()) {
		case 1:
			Emplaoyee emplaoyee=new Emplaoyee();
			System.out.println("enter emp no");
			emplaoyee.setEmpNo(scanner.nextInt());
			System.out.println("enter emp name");
			emplaoyee.setEmpName(scanner.next());
			System.out.println("enter emp address");
			emplaoyee.setAddress(scanner.next());
			emplaoyees.add(emplaoyee);
			break;
		case 2:
			System.out.println("enter emp no to modify");
			int m = scanner.nextInt();
			for(Emplaoyee e:emplaoyees){
				System.out.println("#########33");
				if(e.getEmpNo()==m){
					System.out.println("-----");
					System.out.println(emplaoyees.remove(e));
					System.out.println("++++++++++++");
					break;
				}
			}
			emplaoyee=new Emplaoyee();
			System.out.println("enter emp no");
			emplaoyee.setEmpNo(scanner.nextInt());
			System.out.println("enter emp name");
			emplaoyee.setEmpName(scanner.next());
			System.out.println("enter emp address");
			emplaoyee.setAddress(scanner.next());
			emplaoyees.add(emplaoyee);
			break;
		case 3:
			System.out.println("enter emp no to delete");
			m = scanner.nextInt();
			for(Emplaoyee e:emplaoyees){
				if(e.getEmpNo()==m){
					emplaoyees.remove(e);
				}
			}
			break;
			
		case 4:
			
			System.out.println("empno    empname       address");
			for(Emplaoyee e:emplaoyees){
				System.out.println(e.getEmpNo()+"   "+e.getEmpName()+"  "+e.getAddress());
			}
			break;
				
		default:
			System.out.println("erong option");
			break;
		}
		
		}
	}

}
