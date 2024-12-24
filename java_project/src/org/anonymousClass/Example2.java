package org.anonymousClass;

abstract class AbstractClass{
	public int addition(int a,int b) {
		return a+b;
	}
	public int substraction(int a,int b) {
		return a-b;
	}
}
public class Example2 {
	public static void main(String[] args) {     
		AbstractClass obj1=new AbstractClass() {}; //Anonymous Class
		System.out.println(obj1.addition(24,25));
		System.out.println(obj1.substraction(28,70));
		
		AbstractClass obj2=new AbstractClass() {}; //Anonymous Class
		System.out.println(obj2.addition(21,25));
		System.out.println(obj2.substraction(90,70));
	}
}
