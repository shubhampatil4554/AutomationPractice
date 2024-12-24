package org.classLoadingProcessOfNSMembers;

public class Program1 {
	int a=150;
	String s="Mobile";
	char ch='z';
	public void demo() {
		System.out.println("Demo Start");
		System.out.println(a);//200
		System.out.println(s);//Laptop
		System.out.println(ch);//h
		System.out.println("Demo Ends");
	}
	{//1
		System.out.println("Non Static Block Starts");
		a=200;
		s="Laptop";
		ch='h';
		System.out.println(a);//200
		System.out.println(s);//Laptop
		System.out.println(ch);//h
		System.out.println("Non Static Block Ends");
	}
	Program1() {//2
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		Program1 ref=new Program1();
		ref.demo();
		System.out.println("Main Method Ends");
	}
}
