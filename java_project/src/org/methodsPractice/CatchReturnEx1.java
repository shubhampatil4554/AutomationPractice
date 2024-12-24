package org.methodsPractice;

public class CatchReturnEx1 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		CatchReturnEx1 obj=new CatchReturnEx1();
		obj.addition(10,20);
		obj.substraction(60,50);
		int sum=obj.addition(10,20);
		System.out.println("Sum ="+sum);
		
		int sub=obj.substraction(60,50);
		System.out.println("Sub="+sub);
		System.out.println("Prtogram Ends");
	}
	public int addition(int a,int b){
		return a+b;
	}
	public int substraction(int a,int b){
		return a-b;
	}
}
