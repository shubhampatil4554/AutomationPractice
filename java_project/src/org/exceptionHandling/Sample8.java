package org.exceptionHandling;

public class Sample8 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		checkage(17);
		System.out.println("Program ends");
	}
	public static void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("You are below required age");
		}else {
			System.out.println("You are good to proceed");
		}
	}
}
/*
*When as a programmer you want to throw some exception use throw keyword
*this can be used inside the method body to throw any required exception
*this can throw maximum one exception at a time
*/