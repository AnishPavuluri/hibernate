package prime;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EachCarCountInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name::");
		String name = sc.next();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < name.length(); i++){
			Integer value = map.put(name.charAt(i), 1);
			if(value == null){
				map.put(name.charAt(i), 1);
			}else {
				map.put(name.charAt(i), ++value);
			}
		}
		for(Character c : map.keySet()){
			System.out.println(c+" occur "+map.get(c)+" times");
		}

	}

}
