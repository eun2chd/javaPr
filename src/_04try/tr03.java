package _04try;

import java.util.ArrayList;
import java.util.Scanner;

public class tr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 길이 입력");
		int size = sc.nextInt();
		
		
		for (int i = 0; i < size; i++ ) {
			while(true) {
				list.add(sc.nextInt());
				break;
			}
		}
		
		for(int i = 0; i < size; i++) {
			int num = list.get(i);
			if(list.indexOf(num) != list.lastIndexOf(num)) {
				System.out.print(num + " ");
			}
		
		}

	}

}
