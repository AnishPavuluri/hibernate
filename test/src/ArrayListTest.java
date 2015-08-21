import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");list.add("b");list.add("c");list.add("d");
		Iterator<String> iterator = list.iterator();
		for(int i = 0;iterator.hasNext();i++){
			System.out.println(iterator.next());
			iterator.remove();
		}

	}

}
