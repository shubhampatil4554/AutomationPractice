package org.methodsPractice;

public class ReturnEx2 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		System.out.println("Program Ends");
	}
	public char test1(int a,int b){
		return 'r';
	}
	public double test2(char ch,boolean flag){
		return 99.77;
	}
	public boolean test3(int a,byte b){
		//return true;
		boolean flag=true;
		return flag;
	}
}
