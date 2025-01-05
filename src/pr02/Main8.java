package pr02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main8 {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Apple", 10);
		map.put("Apple", 10);
		map.put("Apple", 10);
		map.put("banana", 20);
		map.put("pnp", 30);
		map.put("ano", 40);
		map.put("boe", 50);
		
		System.out.println(map);
		
		System.out.println(map.get("Apple"));
		
		System.out.println(map.containsKey("banana"));
		System.out.println(map.containsValue(10));
		
		
	
	}

}
