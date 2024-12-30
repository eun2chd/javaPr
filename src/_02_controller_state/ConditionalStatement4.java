package _02_controller_state;

import java.util.Scanner;

public class ConditionalStatement4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1 =0 ,su2 = 0,su3 = 0;
		int sum = 0;
		double avg = 0.0;
		int max = 0,min = 0;
		System.out.println("정수 3개를 입력하세요");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		su3 = sc.nextInt();
		
		sum = su1 + su2 + su3;
		avg = (double)sum / 3.0;
		
        max = su1; 
        min = su1;

        if (su2 > max) max = su2; 
        if (su3 > max) max = su3;

        if (su2 < min) min = su2; 
        if (su3 < min) min = su3;
			
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("합계 : " + sum);
        System.out.println("평균 %.1f : "+ avg);
		
	} // end class
 
} // end main
