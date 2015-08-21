import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		s.add("a");
		s.add("a");
		System.out.println(s);
		Map< String, String> map = new TreeMap<String, String>(new myComparator());
		map.put("am", "sam");
		map.put("aa", "saa");
		System.out.println(map);


	}

}
