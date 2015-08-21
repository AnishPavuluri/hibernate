package comparator;

import java.util.Comparator;

import org.apache.commons.lang.StringUtils;


public class myComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		if(o1.substring(0,1).equals(o2.substring(0,1))){
			return 1;
		}else {
			return o1.compareTo(o2);
		}
		
	}
	

}
