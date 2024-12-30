package _02_controller_state;

import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		
		// 기본 for문
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// while문
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i ++;
		}
		
		// - 적어도 한 번은 수행되는 반복문
		System.out.println("------------");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while(j < 0);
		
		// for - each 문
		System.out.println("====================");
		String[] array = {"A","B","C"};
		for (String a : array) {
			System.out.println("a = " + a);
		}
		
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int k = 1; k <= num; k++) {
			System.out.print(k + " ");
		}
		
		
	}

}
