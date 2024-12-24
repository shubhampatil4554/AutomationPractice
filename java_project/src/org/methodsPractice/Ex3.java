package org.methodsPractice;

public class Ex3 {
	public void testMethod2() {      //Non-static method
		System.out.println("From testMethod2");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Ex3 obj=new Ex3();
		obj.testMethod1();
		obj.testMethod2();
		System.out.println("Program Ends");
	}
	public void testMethod1() {      //Non-static method
		System.out.println("From testMethod1");
	}
}
