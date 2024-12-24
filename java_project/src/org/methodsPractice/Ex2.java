package org.methodsPractice;

public class Ex2 {
	//int a=10;
	public void printData() {    //non-static method
		System.out.println("Hello");
		System.out.println("Good morning");
		System.out.println("How are you?");
	}
	public static void main(String[] args){
		System.out.println("Program Starts");
		Ex2 obj = new Ex2();
		//System.out.println(obj.a);
		obj.printData();
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		obj.printData();
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		obj.printData();
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		obj.printData();
		System.out.println("10");
		System.out.println("Program Ends");
	}
	public static void testMethod1() {     //Static Method
		
	}
	public void testMethod2() {            //Non-Static Method
		
	}
}
