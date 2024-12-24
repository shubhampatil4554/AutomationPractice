package org.decisionStatements;

public class IfElseStatement {
	public static void main(String[]args) {
		double fee=39950;
		if(fee>=37950) {
			System.out.println("Attend Classes!");
		}else {
			System.out.println("Get Lost!");
		}
		System.out.println("Thank You!");
		int num=21;
		if(num%2==0) {
			System.out.println("It is Even Number");
		}else {
			System.out.println("It is odd Number");
		}
		System.out.println("********************");
		int year=2020;
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("it is a leap year");
		}
	}
}
