package org.basicPrograms2;

public class AdditionASCII {
	public static void main(String[] argd){
		System.out.println("Program Starts");
		int a=10,b=20;
		System.out.println("Sum= "+(a+b));
		
		char ch1='A',ch2='B';
		System.out.println("ch1 :"+ch1);
		System.out.println("ch2 :"+ch2);
		System.out.println(" "+ch1+ch2);  //AB
		System.out.println(ch1+ch2);   //131
		
		//'A' to 'Z' -> ASCII value -> 65 to 90
		//'a' to 'z' -> ASCII value -> 97 to 122
		System.out.println("Program Ends");
	}
}
