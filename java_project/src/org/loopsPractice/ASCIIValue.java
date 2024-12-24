package org.loopsPractice;

public class ASCIIValue {
	public static void main(String[] args){
		System.out.println("Program starts");
		for (char ch='A';ch<='Z';ch++){
			System.out.println(ch +":"+(int)ch);
		}
		System.out.println("Program Ends");
	}
}
//'A' to 'Z'= 65 to 90
//'a' to 'z' = 97 to 122