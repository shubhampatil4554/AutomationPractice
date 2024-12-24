package org.methodsPractice;

public class CatchReturnEx3 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		CatchReturnEx3 obj=new CatchReturnEx3();
		int res1=obj.result(20,30,20);
		System.out.println("res="+res1);
		System.out.println("*********");
		
		int sum=obj.addition(70,80);
		int res2=obj.substraction(sum,90);
		System.out.println("res2="+res2);
		System.out.println("************");
		
		int res3=obj.substraction(obj.addition(70,80),90);
		System.out.println("res3="+res3);
		System.out.println("*************");
		
		System.out.println("res4="+obj.substraction(obj.addition(70,80),90));
		System.out.println("************");
		System.out.println("Program ends");
	}
	public int addition(int a,int b){
		return a+b;
	}
	public int substraction(int a,int b){
		return a-b;
	}
	public int result(int a,int b,int c){
		return a+b-c;
	}
}
