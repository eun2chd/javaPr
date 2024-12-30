package _02_controller_state;

import java.util.Scanner;

public class Method {
	// 메소드 정의
	/*
	 * 접근제한자 리턴타입 메서드_이름(인자1,인자2,---) {
	 *  // 메서드 행위
	 *  return 반환값;
	 *  }
	 * 
	 * */
	
	public static void hello() {
		System.out.println("hello java");
		
	}
	
	
	public static void main(String[] args) {
		
		
		hello();
		System.out.println(sum1(10,20));
		
		int[] numbers = {10,20};
		int[] numbers2 = {10,20,30,40};
		
		System.out.println(mult(10, 20));
		System.out.println(mult2(numbers2));
		System.out.println(new int[] {10,20});
		
		
		
	} // end main

	// 반환값이 없는 메소드
		public static int sum1(int x, int y) {
			return x + y;
		}
		
   // call by value (값 전달)
		public static int mult(int x, int y) {
			return x * y;
		}
		// call by reference (참조 전달)
		public static int mult2(int[] nums) {
			return nums[0] * nums[1];
		}

} // end class
