package org.numberPrograming;

public class PalindromeNo {
	public static void main(String[] args){
		System.out.println("Program Starts");
		PalindromeNo.checkPalindrome(121,0,0);
		System.out.println("Program Ends");
	}
	public static int checkPalindrome(int num,int remainder,int result){
		int temp=num;
		while (num>0){
			remainder=num%10;
			result=result*10+remainder;
			num=num/10;
		}
		if (temp==result){
			System.out.println("It is a Palindrome Number");
		}else{
			System.out.println("It is not a Palindrome Number");
		}
		return temp;
	}
}
//121,232,1234321 is a palindrome no.