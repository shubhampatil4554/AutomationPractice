package org.methodsPractice;

public class ReturnEx1 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		ReturnEx1 obj=new ReturnEx1();
		obj.addition1();
		obj.addition(10,20);
		System.out.println("Program Ends");
	}
	public int addition(int a,int b){
		int sum = a+b;
		System.out.println("Sum="+sum);
		return sum;
	}
	public int addition1(){
		int a=10,b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		int sum = a+b;
		System.out.println("Sum="+sum);
		//return by diffault hidden,returns contrl
		// return 1;    returns control + int type mandatory
		//return 30;
		return sum;
	}
}
