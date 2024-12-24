package org.typeCasting;

public class Example1{
	public static void main(String[] args){
		System.out.println("Program starts");
		int num1=25;               //Homogeneous statement
		long num2=num1;            //Heterogeneous statement--Widening implicit/auto
		double num3=(double)num2;  //Heterogeneous statement-Widening explicit
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		float num4=55.56f;
		double num5=num4;           //primitive casting-widening implicit/auto
		double num6=(double)num4;   //primitive casting-widening explicit
		
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		//Narrowing will be a loss either in size or data
		double num7=102.56;
		float num8=(float)num7;     //primitive casting - narrowing explicit
		long num9=(long)num7;       //primitive casting - narrowing explicit
		int num10=(int)num7;        //primitive casting - narrowing explicit
		
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		System.out.println("Program Ends");
	}
}
/*
byte<short<int<long<float<double
*/
