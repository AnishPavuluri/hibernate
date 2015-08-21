

import java.util.Comparator;

import org.apache.commons.lang.StringUtils;


public class myComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		System.out.println("o1------->"+o1.substring(0,1));
		System.out.println("o2------->"+o2.substring(0,1));
		if(o1.substring(0,1).equals(o2.substring(0,1))){
			System.out.println("if");
			return 1;
		}else {
			System.out.println("else");
			return o1.compareTo(o2);
		}
		
	}
	

}
