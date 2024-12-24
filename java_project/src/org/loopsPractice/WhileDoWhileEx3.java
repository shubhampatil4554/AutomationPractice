package org.loopsPractice;

public class WhileDoWhileEx3 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		 WhileDoWhileEx3.funOfBreakContinue(1);
		System.out.println("Program Ends");
	}
	public static int funOfBreakContinue(int a){
		while (a<11){
			//Syste.out.println(a);
			if (a==5){
				//break;
				//System.out.println("Hello");   break error
				System.out.println("hello");
				a++;
				continue;
				//System.out.println("Hello");    continue error
			}
			System.out.println(a);
			a++;
		}
		return a;
	}
}
//1.Continue is used to skip the execution of current iteration of loop 
//2.-You want to Skip the remaining code within the loop for the current iteration