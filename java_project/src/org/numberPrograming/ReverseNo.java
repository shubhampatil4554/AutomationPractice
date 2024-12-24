package org.numberPrograming;

public class ReverseNo {
	public static void main(String[] args){
		System.out.println("Program Starts");
		ReverseNo.printReverseNo(4567,0,0);
		System.out.println("Program Ends");
	}
	public static int printReverseNo(int num,int remainder,int result){
		int temp=num;
		while(num>0){
			remainder=num%10;
			result=result*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse of"+temp+"No. is"+result);
		return temp;
	}
}
