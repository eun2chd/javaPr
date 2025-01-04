package _10_Collection._list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		final int exit = -1;
		
		Set<Integer> set1 = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num == exit) {
				System.out.println("중복 제거된 정수 목록 : " + set1);
				break;
			}
			set1.add(num);
			
		}
			
	}

}
