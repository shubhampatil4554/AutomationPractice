package org.methodOverLoading;

public class Example6 {
	public static void main(String[] args){
		System.out.println(getNumber(20));
		System.out.println(getNumber(25.36f));
	}
	static double getNumber(float num){
		System.out.println("Number is ");
		return num;
	}
	static int getNumber(int num){
		System.out.println("Number is ");
		return 20;
	}
}
/*
Q)can we store lower datatype in any higher datatype while overload of method vice versa is not possible
Q)Can we overload a method if meyhod if method has different return type
*/
