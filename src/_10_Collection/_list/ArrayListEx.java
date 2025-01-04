package _10_Collection._list;


import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// ArrayList 컬렉션 생성
		List<book> list = new ArrayList<book>();
		
		// 객체 추가
		list.add(new book("title1", "author1"));
		list.add(new book("title2", "author2"));
		list.add(new book("title3", "author3"));
		list.add(new book("title4", "author4"));
		list.add(new book("title5", "author5"));
		
		System.out.println(list);
		
		// 리스트 개수 얻기
		int size = list.size();
		System.out.printf("총 %d 권의 책이 존재합니다 %n%n", size);
		
		// 객체 가져오기 (인덱스 이용)
		System.out.println(list.get(2));
		
		// 삭제 
		list.remove(2);
		System.out.println(list);
		
		// 모든 객체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		
		
	}

}
