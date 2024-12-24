package org.exceptionHandling;

public class Sample6 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int []num=new int[3];
		try {
			num[3]=10/0;
		}catch(ArithmeticException e) {
			System.out.println("Exception Handled from ArithmeticException");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {//first exception is num[3] and jumps to**
			System.out.println("Exception Handled from ArrayIndexOutOfBoundException");
			e.printStackTrace();//to get complete exception
		}catch(Throwable e) {
			System.out.println("Exception Handle from Throwable");
			e.printStackTrace();
		}
		System.out.println("******************");
		try {
			num[3]=10/5;
		}catch(ArithmeticException e) {
			System.out.println("Exception Handled from ArithmeticException");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {//jumps to program ends after executing
			System.out.println("Exception Handled from ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}catch(Throwable e) {
			System.out.println("Exception Handled from Throwable");
			e.printStackTrace();
		}
		System.out.println("Program Ends");
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