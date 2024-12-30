package _02_controller_state;

import java.util.Scanner;

public class MethodOverloading {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MethodOverloading ol = new MethodOverloading();
		System.out.println("숫자 두개 입력");
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		
		
		System.out.println("덧셈 결과 : " + ol.add(num1, num2));
		System.out.println("뺄셈 결과 : " + ol.minus(num1, num2));
		System.out.println("곱셉 결과 : " + ol.mult(num1, num2));
		System.out.println("나눗셈 결과 : " + ol.div(num1, num2));
		
		double su1,su2;
		System.out.println("====================================");
		
		System.out.println("반지름이 5인 원의 넓이 : " + ol.result(5, 5) * 3.14);
		System.out.println("가로 4, 세로 7인 직사각형의 넓이 : " + ol.mult(7, 4));
		System.out.println("밑변 6, 높이 3인 삼각형의 넓이 :  : " + ol.result(6, 3) / 2);
		
	} // end main

	public double add(double a, double b) { return  (a + b); };
	
	public double minus(double a, double b) { return  (a - b); };
	
	public double mult(double a, double b) { return  (a * b);};
	
	public double div(double a, double b) { return (a / b);};
	
	public double result(double su1, double su2) { return su1 * su2;};
	
	
} // end class
