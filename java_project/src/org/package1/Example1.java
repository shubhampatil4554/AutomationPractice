package org.package1;

public class Example1{
	public static void main(String[] args){
		System.out.println("Hello,I am Example1 class main");
		Sample1 ref=new Sample1();
		//System.out.println("private num1:-"+ref.num1);
		System.out.println("default num2:-"+ref.num2);
		System.out.println("protected num3:-"+ref.num3);
		System.out.println("public num4:-"+ref.num4);
	}
}
/*
private:-
     member declared with private,will be accessible with in that class only
default:-
     member declared with default will be accessible with the package level
protected:-
     member declared with protected,will be accessible till package level but we can access 
	 them from outside the package or from another package using inheritance
public:-
     member declared with public,will be accessible from anywhere 
	 but: to access them from outside package make sure its class is declared as public 
*/
