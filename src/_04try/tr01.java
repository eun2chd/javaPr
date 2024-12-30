package _04try;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tr01 {
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
			
			for (int num : list) {
				sum += num;
			}
			double avg = (double)sum / size;
			System.out.println("평균 : " + avg );
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("숫자만 입력하세요");
		}
		


	}

}
