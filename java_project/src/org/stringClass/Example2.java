package org.stringClass;

public class Example2 {
	public static void main(String[] args){
		System.out.println("Program starts");
		//String class object using literal
		String s1="   WelcomeToJavaProgramming   ";//new object will created inside string constant pool area
		System.out.println("String object s1: "+s1);//   WelcomeToJavaProgramming   .
		System.out.println("String object char count: "+s1.length());//30
		System.out.println("String object s1 with spaces: "+s1.trim());//WelcomeToJavaProgramming
		System.out.println("String object char count with spaces: "+s1.trim().length());//24
	    System.out.println("Program ends");
	}
}
