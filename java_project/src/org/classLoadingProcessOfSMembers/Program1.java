package org.classLoadingProcessOfSMembers;

public class Program1 {
	static int a=100;
	static char ch='x';
	public static void demo() {
		System.out.println("This demo() from Program1");
		System.out.println(a);//200
		System.out.println(ch);//y
		a=500;
		System.out.println(a);//500
	}
	static {
		System.out.println("This is from static block");
		System.out.println(a);//100
		System.out.println(ch);//x
		a=200;
		ch='y';
		System.out.println(a);//200
		System.out.println(ch);//y
	}
	public static void main(String[] args) {
		System.out.println("Main method starts");
		System.out.println(a);//200
		System.out.println(ch);//y
		demo();
		System.out.println("Main method ends");
	}
}
