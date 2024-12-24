package org.methodsPractice;

public class CatchReturnInSysEx {
	int c=100;
	public static void main(String[] args){
		System.out.println("Program Starts");
		CatchReturnInSysEx obj = new CatchReturnInSysEx();
		System.out.println("c="+obj.c);
		
		System.out.println("Sum="+obj.addition(10,20));
		//System.out.println("method="+obj.test());       //error
		System.out.println("Program Ends");
	}
	public int addition(int a,int b){
		return a+b;
	}
	public void test(){
		System.out.println("Test");
	}
}
