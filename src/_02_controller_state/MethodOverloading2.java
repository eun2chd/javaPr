package _02_controller_state;

import java.util.Scanner;

public class MethodOverloading2 {
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {

		MethodOverloading2 ol = new MethodOverloading2();
		System.out.println(ol.add(1, 2));
		
		System.out.println(ol.add(5, 2));
		
		System.out.println(ol.add(5, 3, 1));
		
	} // end main

	public int add(int a, int b) { return a + b; };
	
	public double add(double a, double b) { return a - b; };
	
	public int add(int a, int b, int c) { return a + b + c; };
} // end class
