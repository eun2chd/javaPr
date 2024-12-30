package java_First_Project;

import java.util.Scanner;

public class qz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int sum = 0;
				double avg = 0.0;
				int[] arr = new int[5];
				
				System.out.println("5개의 정수를 입력하세요");
				
				for(int i = 0; i < arr.length; i++) {
					int su = sc.nextInt();
					arr[i] = su;
					sum += arr[i];
				}
				
				System.out.println(sum);
				avg = (double)sum / 5;
				System.out.println("평균은 : " + avg);
				
	}

}
