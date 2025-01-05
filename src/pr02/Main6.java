package pr02;

import java.util.ArrayList;

public class Main6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("banana");
		list.add("Apple");
		
		System.out.println("List " + list);
		
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains("Apple"));
		
	}
	
}
