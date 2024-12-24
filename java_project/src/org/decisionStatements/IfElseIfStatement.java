package org.decisionStatements;

import java.util.Scanner;

public class IfElseIfStatement {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the obtained marks");
		int marks=scn.nextInt();
		if(marks<35) {
			System.out.println("Your are fail");
		}else if(marks>35 && marks<60) {
			System.out.println("You are just passed");
		}else if(marks>=60 && marks<75) {
			System.out.println("You are passed with First Class");
		}else if(marks>=75 && marks<=100) {
			System.out.println("You are passed with Distinction");
		}else {
			System.out.println("Invalid Marks");
		}
	}
}
