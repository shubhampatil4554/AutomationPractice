package org.numberPrograming;

public class SwappingNo {
	public static void main(String[] args){
		System.out.println("Program starts");
		SwappingNo.checkSwappingNo(10,20);
		System.out.println("Program ends");
	}
	public static int checkSwappingNo(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		return temp;
	}
}
