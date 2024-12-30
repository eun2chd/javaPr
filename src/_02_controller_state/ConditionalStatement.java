package _02_controller_state;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		String job;

		if (age >= 1 && age <= 7) {
			job = "유아";
		} else if (age >= 8 && age <= 13) {
			job = "초등학생";
		} else if (age >= 14 && age <= 16) {
			job = "중학생";
		} else if (age >= 17 && age < 20) {
			job = "고등학생";
		} else {
			job = "성인";
		}

		System.out.println(job);

	} // end class

} // end main
