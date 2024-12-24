package org.loopsPractice;

public class BreakForEx {
	public static void main(String[] args){
		System.out.println("Program Starts");
		for (int i=1;i<11;i++){
			if (i==5){
				break;
				//System.out.println(i); //Error
			}
			System.out.println(i);
		}
		System.out.println("Program Ends");
	}
}
//break = it is use to stop loop and control goes outside loop