package java_First_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력해 주세요 : ");
			String input = sc.nextLine();
			
			if(input.equalsIgnoreCase("exit")) {
				for(String item : list) {
					System.out.println(item);
				}
				break;
			}
			
			list.add(input);
		}

	} // end clsass
 
} // end main
