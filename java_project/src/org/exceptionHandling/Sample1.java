package org.exceptionHandling;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=0,result;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		try {
			result=num1/num2;  //abnormal statement
			System.out.println("Result="+result);
		}catch(Throwable e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Program ends");
	}
}
/*
try:-contains statement that may introduce exception
catch:-will handle excpetion coming from try block based on its parameters
**when you are not aware of exception coming from try block then in catch block use Throwable class
Or
if you want to write single try block that can handle any type of exception coming from try block then use Throwable
*/