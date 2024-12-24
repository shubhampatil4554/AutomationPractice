package org.loopsPractice;

public class WhileDoWhileEx1 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		WhileDoWhileEx1.print123(1,1);
		System.out.println("Program Ends");
	}
	public static int print123(int a,int b){
		while(a<4){
			System.out.println(a);
			a++;
		}
		System.out.println("a="+a);   //4
		System.out.println("***********");
		do{
			System.out.println(b);
			b++;
		}while(b<4);
		System.out.println("b="+b);   //4
		return a;
	}
}
