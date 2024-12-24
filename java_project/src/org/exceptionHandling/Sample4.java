package org.exceptionHandling;

public class Sample4 {
	public static void min(String[]args) {
		System.out.println("Program starts");
		int num1=17,num2=0,result;
		System.out.println("Num1="+num1);
		System.out.println("Num2="+num2);
		try {
			result=num1/num2;
			System.out.println("Result="+result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled from ArrayIndexOutOfBoundException");
		}
		catch(ArithmeticException e) {//This block executed
			System.out.println("Exception Handled from ArithmeticException");
		}
		catch(Throwable e) {
			System.out.println("Excpetion handled from Throwable");
		}
		System.out.println("Program ends");
	}
}
/*
*try:-contains statement that may introduce exception
*catch:-will handle excpetion coming from try block based on its parameters
**when you are not aware of exception coming from try block then in catch block use Throwable class
      Or
if you want to write single try block that can handle any type of exception coming from try block then use Throwable
**A single try block can have multiple catch blocks but at a time only one catch block will be excuted
*/