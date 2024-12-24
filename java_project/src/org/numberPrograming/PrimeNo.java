package org.numberPrograming;

public class PrimeNo {
	public static void main(String[] args){
		System.out.println("Program Starts");
		PrimeNo.checkPrimeNo(2,13);
		System.out.println("Program Ends");
	}
	public static int checkPrimeNo(int i,int num){
		boolean flag=true;
		for(   ; i<(num/2);i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("It is a Prime No");
		}else{
			System.out.println("It is not a prime no");
		}
		return num;
	}
}
