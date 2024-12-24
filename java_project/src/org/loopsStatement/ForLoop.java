package org.loopsStatement;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the start mumber");
		int start = scn.nextInt();
		System.out.println("Enter the end number");
		int end = scn.nextInt();
		for (int i = start; start<end; start++) {
			System.out.println(start);
		}
	}
}
