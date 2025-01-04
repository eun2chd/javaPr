package _10_Collection._list._map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapEx {
	// 키는 id, 값은 name 인 HashMap
	
	public static void main(String[] args) {
		Map<Integer, String>map = new HashMap<Integer, String>();
		
		// 객체 저장 (키 중복 x)
		map.put(1001, "홍길동");
		map.put(1002, "철수");
		map.put(1003, "영희");
		map.put(1004, "인수");
		
		// 전체 객체 수
		int size = map.size();
		
		// 키를 이용해서 값 얻기
		int key = 1003;
		String value = map.get(key);
		System.out.println(value);
		
		// 키와 값으로 구성된 모든 Map.Entry 객체를 set 담아 리턴
		Set<Map.Entry<Integer, String>>entrySet = map.entrySet();
		System.out.println(entrySet);
		
		// iterator
		entrySet.iterator();
		java.util.Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry);
			
			Integer k = entry.getKey();
			String v = entry.getValue();
			
			System.out.printf("%s 학생은 %d 번 입니다. %n", v, k);
			
		}
		
		
		// 키 Set 컬렉션 얻고, 반복해서 키와 값 얻기
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		// 주어진 키와 일치하는 entry 삭제
		String deletedValue = map.remove(key);
		System.out.printf("%s 학생 삭제", deletedValue);
		
		
	}	
}
