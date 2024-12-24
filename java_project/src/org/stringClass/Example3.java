package org.stringClass;

public class Example3 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		//String class object literal
		String s1="WelcomeToJavaProgramming";//new object will be created inside string constant pool area
		System.out.println("String object s1: "+s1);//WelcomeToJavaProgramming
		System.out.println("String object char count: "+s1.length());//24
		System.out.println("char at index 2 from string object s1: "+s1.charAt(2));//l
		System.out.println("*******Print character from start to end*******");
		for(int i=0;i<s1.length();i++){
			System.out.println("Character at index "+i+" is= "+s1.charAt(i));
		}
		System.out.println("*******Print character from end to start*******");
		for(int i=s1.length()-1;i>=0;i--){
			System.out.println("Character at index "+i+" is= "+s1.charAt(i));
		}
		System.out.println("Original s1 value: "+s1);
		System.out.println("s1 in lower case: "+s1.toLowerCase());//welcometojavaprogramming
		System.out.println("s1 in Upper case: "+s1.toUpperCase());//WELCOMETOJAVAPROGRAMMING
		System.out.println("First time 'o' index in string s1: "+s1.indexOf('o'));//4
		System.out.println("Last time 'o' index in string s1: "+s1.lastIndexOf('o'));//15
		String s2=s1.substring(9,13);
		System.out.println("New substring from s1: "+s2);//Java
		System.out.println("Program ends");
	}
}