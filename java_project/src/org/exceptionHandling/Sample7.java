package org.exceptionHandling;

public class Sample7 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int []num=new int[3];
		try {
			num[3]=10/0;
		}catch(Throwable e) {
			System.out.println("Exception Handled arithmetic exception");
			e.printStackTrace();//to get complete exception             
		}
	/*	catch(ArithmeticException e) { //error-exception ArithmeticException has already been caught
			System.out.println("Exception Handled");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){ //error-exception ArithmeticException has already been caught
		    System.out.println("Exception Handled");
			e.printStackTrace();
		}
	*/
		System.out.println("Program ends");
	}
}
/*
try:-    contains statement that may introduce exception
catch:-  will handle excpetion coming from try block based on its parameters

** when you are not aware of exception coming from try block then in catch block use Throwable class
Or
   if you want to write single try block that can handle any type of exception coming from try block then use Throwable

** A single try block can handle one exception at a time
*/