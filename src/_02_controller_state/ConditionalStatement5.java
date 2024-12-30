package _02_controller_state;

import java.util.Scanner;

public class ConditionalStatement5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		String s1 = "홍길동";
		String s2 = "성춘향";
		
		if (name.equals(s1)) {
			System.out.println("남자");
		} else if(name.equals(s2)) {
			System.out.println("여자");
		} else {
			System.out.println("모르겠어요");
		}
 		
		
	} // end class
 
} // end main
