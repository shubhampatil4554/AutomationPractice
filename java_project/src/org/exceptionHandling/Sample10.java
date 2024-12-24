package org.exceptionHandling;

public class Sample10 {
	public static void main(String[]args) {
		System.out.println("Program Starts");
		int num1=10,num2=0,result;
		System.out.println("Num1="+num1);
		System.out.println("Num2="+num2);
		try {
			result=num1/num2;
			System.out.println("Result="+result);
		}catch(Throwable e) {
			System.out.println("Exception Handled");
		}finally {
			System.out.println("Finally Block Starts");
			System.out.println("Finally Block Ends");
		}
		System.out.println("Program Ends");
	}
}
/*
finally block:-
     will be executed in respective of exception occured or not or handle or not 
	 it contains some mandatory statement which will required to execute
*/