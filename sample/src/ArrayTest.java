import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String[]> list = new ArrayList<String[]>();
		String s1[] = new String[1];
		String s2[] = new String[2];
		s1[0] = "1";
		s2[0] = "4";
		s2[1] = "2";
		list.add(s1);list.add(s2);
		System.out.println(list.get(0)[0]);

	}

}
