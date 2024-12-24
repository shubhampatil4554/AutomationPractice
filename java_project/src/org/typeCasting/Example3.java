package org.typeCasting;

public class Example3{
	public static void main(String[] args){
		System.out.println("Program starts");
		int sum=(int)getSum(25,26);       //Explicit Narrowing
		System.out.println("Addition of numbers: "+sum);
		System.out.println("Program Ends");
	}
	static double getSum(int num1,int num2){
		int result=num1+num2;
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		return result;    //auto widening
	}
}
