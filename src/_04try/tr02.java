package _04try;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tr02 {
	public static void main(String[] args) {

	
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("배열의 길이를 입력하세요");

			int size = sc.nextInt();
			// 배열 길이 검증
			if (size <= 0) {
				System.out.println("배열의 길이는 1이상의 값만 입력하세요");
				return;
			}
			
			int sum = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			System.out.println("입력할 숫자는 총 : " + size + " 개 입니다.");
			
			for (int i = 0; i < size; i++) {
				while(true) {
					try {
						list.add(sc.nextInt());
						break;
					} catch (InputMismatchException e) {
						// TODO: handle exception
						System.out.println("숫자만 입력하세요");
						break;
					}
				}
			}
			
			ArrayList<Integer> sameList = new ArrayList<Integer>();
			
			for(int i = 0; i < size; i++ ) {
				int num = list.get(i);
				
				// sameList 안에 num 이 있다면 true -> false 로 변경 
				// num 값이 없으면 false -> true 로 바뀜
				
				
				if(list.indexOf(num) != list.lastIndexOf(num) && !sameList.contains(num)) {
					sameList.add(num);
					
					for(int j = 0; j < list.size(); j++) {
						if(list.get(j) == num ) {
							System.out.print("[" + num + "]");
						}
					}
					System.out.println();
				}
				
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("숫자만 입력하세요");
		}
	
	}

}
