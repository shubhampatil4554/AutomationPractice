package org.typeCasting;

public class Example2{
	public static void main(String[] args){
		System.out.println("Program Starts");
		calling(12345);
		System.out.println("Program Ends");
	}
	/*static void calling(int num){    //double num=12345.36 | double num=12345
		System.out.println("I am calling you on int-number "+num);
	}*/
	static void calling(double num){   //double num=12345.36 | double num=12345
		System.out.println("I am calling you on double-number "+num);
	}
}