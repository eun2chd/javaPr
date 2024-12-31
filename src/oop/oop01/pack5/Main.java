package oop.oop01.pack5;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<oop.oop01.pack5.Rectangle> r1 = new ArrayList<oop.oop01.pack5.Rectangle>();

		while (true) {
			System.out.println("사각형의 가로와 세로 길이을 뛰어쓰기로 입력");
			int width = sc.nextInt();
		    int height = sc.nextInt();
			oop.oop01.pack5.Rectangle w1 = new oop.oop01.pack5.Rectangle(width,height);			
			r1.add(w1);

			if (w1.getWidth() == 0 && w1.getHeight() == 0) {
				if(w1.getWidth() != 0 && w1.getHeight() != 0)
				for (oop.oop01.pack5.Rectangle rect : r1) {
					System.out.println("가로 길이 : " + rect.getWidth());
					System.out.println("세로 길이 : " + rect.getHeight());
					System.out.println("면적 : " + rect.getArea());
					System.out.println("--------------------------------------------");
				}
				break;
			}

		}

	}

}
