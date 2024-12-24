package org.methodsPractice;

public class ReturnEx3 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		
		System.out.println("Program Ends");
	}
	public int addition1(int a,int b){
		int sum= a+b;
		return sum;
	}
	public int addition2(double a,double b){
		int sum=(int)(a+b);
		return sum;
	}
	public int addition3(double a,double b){
		return (int)(a+b);
	}
	public byte addition4(byte a,byte b){
		return (byte)(a+b);
	}
}
//double +double = double
//int +int = int
//int +long+float+double= double
//byte + short= int
//short + short= int 