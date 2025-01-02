package static03;

import java.util.Scanner;

public class CirMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름 입력");
		int cir = sc.nextInt();
				
		System.out.println("원의 반지름");
		System.out.println("원의 넓이 : " + Circle.calculateArea(cir));
		

	}

}
