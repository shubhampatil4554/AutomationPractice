package org.exceptionHandling;

public class Sample2 {
	public static void main(String[]args) {
		System.out.println("Program starts");
		int num1=25,num2=5,result;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		try {
			result=num1/num2;//normal statement
			System.out.println("result="+result);
		}//if try block contains normal statements catch block does not excutes
		catch(Throwable e) {           //not executed
			System.out.println("Exception Handled");
		}
		System.out.println("Program Ends");
	}
}
/*
try:-contains statement that may introduce exception
catch:-will handle excpetion coming from try block based on its parameters
**when you are not aware of exception coming from try block then in catch block use Throwable class
Or
if you want to write single try block that can handle any type of exception coming from try block then use Throwable
*/