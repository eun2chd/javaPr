package java_First_Project;

import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 묵시적 형변환 (Wider Conversion)
		// 더 작은 타입에서 더 큰 타입으로 자동 형변환
		// 반대의 경우는 묵시적 형변환 불가능 -> 명시적으로 변환해야 함
		
		int smallNumber = 10;
		double bigNumber = smallNumber; // int 를 dobule 로 자동 형변환
		
		System.out.println("smallNumber : " + smallNumber);
		System.out.println("smallNumber : " + bigNumber);
		
		
		///// 
		// 명시적 형변환 (Narrow Conversion)
		// - 더 큰 타입에서 더 작은 타입으로의 강재 형변환
		double bigNumber2 = 20.5;
		int smallNumber2 = (int)bigNumber2;  // double 을 int 로 강제 형변환
		
		System.out.println("smallNumber : " + smallNumber2);
		System.out.println("smallNumber : " + bigNumber2);
		
		// 데이터 손실이 발생할 수 있는 경우 주의해야함
		int largeNumber = 1000;
		byte smallByte = (byte) largeNumber;
		
		System.out.println("largeNumber : " + largeNumber);
		System.out.println("largeNumber : " + smallByte);
		
	
	}

}
