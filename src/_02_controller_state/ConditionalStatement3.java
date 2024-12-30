package _02_controller_state;

import java.util.Scanner;

public class ConditionalStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 문자열(String) 객체 비교
//		System.out.println("이름을 입력해주세요.");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine(); // 엔터 이전까지의 문자열을 읽어올것이다.
//		System.out.println(name);
		
		// == 사용한다. 
//		if (name == "홍길동") System.out.println("환영합니다.");
//		else System.out.println("이름을 다시 확인해 주세요");
		
		// 문자열.equals() 사용한다. (o) 
//		if (name.equals("홍길동")) System.out.println("환영합니다.");
//		else System.out.println("이름을 다시 확인해 주세요");
		
		// why?
		// '==' 연산자 : 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
		// '.equals()' 메서드 : 두 객체의 내용이 동일한지 비교를 
		
		// 문자형 리터 (문자형 변수를 선언한경우) java 에서 동일한 문자열 리터럴이 사용될 경우 
		// java 컴파일러는 문자열 풀(String pool) 이라는 공유된 메모리 영역에 해당 문자열을 저장
		// 즉 str1, str2 가 같은 문자열을 가르키고 있으므로 같은 참조를 가르키고 있다.
		String str1 = "hello";
		String str2 = "hello";
		
		
//		if(str1 == str2) {
//			System.out.println("같은 참조 를 가르킨다.");
//		} else {
//			System.out.println("서로 다른 참조를 가르킨다.");
//		}
//		
//		if(str1.equals(str2)) {
//			System.out.println("내용이 같다");
//		} else {
//			System.out.println("내용이 다르다.");
//		}
//		
		// 문자열 "동적 할당" 의 경우, new String(...) 사용해 새로운 문자열 객체를 생성하므로 서로 다른 객체를 가르키게 된다.
		String str3 = new String("hi");
		String str4 = new String("hi");
		
		if(str3 == str4) {
			System.out.println("같은 참조 를 가르킨다.");
		} else {
			System.out.println("서로 다른 참조를 가르킨다.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("내용이 같다");
		} else {
			System.out.println("내용이 다르다.");
		}
		
		
	} // end class
 
} // end main
