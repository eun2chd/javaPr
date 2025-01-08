package _10_Collection._list._map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapEx2 {
	// 키는 id, 값은 name 인 HashMap
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1001, "홍길동");
		map.put(1002, "이무개");
		map.put(1003, "철수");
		
		System.out.println(map.size());
		System.out.println(map);
		
		int key = 1001;
		String value = map.get(key);
		System.out.println(value);
		
		
		Set<Map.Entry<Integer, String>>entrySet = map.entrySet();
		System.out.println(entrySet);
		
		entrySet.iterator();
		java.util.Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry);
		}
		
	
		
		
	}	
}
