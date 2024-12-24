package org.loopsPractice;

public class WhileDoWhileEx2 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		WhileDoWhileEx2.differenceOfWhileDoWhile(10,10);
		System.out.println("Program Ends");
	}
	public static int differenceOfWhileDoWhile(int a,int b){
		while(a<4){                     //condition false
			System.out.println(a);      //not executable 
			a++;
		}
		System.out.println("a="+a);     //10
		System.out.println("********");
		do{
			System.out.println(b);      //10
			b++;
		}while(b<4);
		System.out.println("b="+b);     //11
		return a;
	}
}
