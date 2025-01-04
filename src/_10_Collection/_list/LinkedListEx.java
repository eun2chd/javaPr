package _10_Collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		// arrayList 컬렉션 객체 생성
		
		List<String> list1 = new ArrayList<>();
		
		// LinkedList
		List<String> list2 = new LinkedList<>();
		
		// 시작 끝 변수 선언
		
		long startTime;
		long endTime;
		
		// ArrayList 의 0번 인덱스에 데이터 추가 (10000회 반복)
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간" + (endTime - startTime));
		
		
		// ArrayList 의 0번 인덱스에 데이터 추가 (10000회 반복)
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간" + (endTime - startTime));
		
		// LinkedList 가 요소 추가할 때 더 빠르다.
		
		
	}

}
