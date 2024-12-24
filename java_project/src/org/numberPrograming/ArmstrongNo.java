package org.numberPrograming;

public class ArmstrongNo {
	public static void main(String[] args){
		System.out.println("Program Starts");
		ArmstrongNo.checkArmstrong(153,0,0);
		System.out.println("Program Ends");
	}
	public static int checkArmstrong(int num,int remainder,int sum){
		int temp=num;
        while(num>0){
			remainder=num%10;
			sum=sum+remainder*remainder*remainder;
			num=num/10;
		}	
		if (temp==sum){
			System.out.println("It is Armstrong No.");
		}else{
			System.out.println("It is not a Armstrong NO");
		}
		return temp;
	}
}
