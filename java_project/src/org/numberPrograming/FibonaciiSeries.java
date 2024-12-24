package org.numberPrograming;

public class FibonaciiSeries {
	public static void main(String[] args){
		System.out.println("Program starts");
		FibonaciiSeries.checkFibonaciiseries(0,1,0);
		System.out.println("Program Ends");
	}
	public static int checkFibonaciiseries(int a,int b,int sum){
		System.out.println(a);
		System.out.println(b);
		while(sum<=100){
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
		return sum;
	}
}
