package org.loopsStatement;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int num1=scn.nextInt();
		System.out.println("Enter the ending number");
		int num2=scn.nextInt();
		while(num1<num2) {
			System.out.println(num1);
			num1++;
		}
	}
}
