package org.methodOverLoading;

public class Example4 {
	public static void main(String[] args){
		System.out.println("Program starts");
		main(14);                            //we can overload main method
		System.out.println("Program Ends");
	}
	public static void main(int num){
		System.out.println("From Main Method With Int Parameter");
	}
}
