package org.methodOverLoading;

public class Example2 {
	public static void main(String[] args){
		addition();              //call line no.10
		addition(25.36f,10);     //call line no.17
		addition(30,45.28f);     //call line no.24
		addition(85,15);         //call line no.31
	}
	public static void addition(){
		System.out.println("******Addition without paramter*****");
		int num1=25,num2=50,res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
	public static void addition(float num1,int num2){
		System.out.println("******Addition with paramter float int*****");
		double res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
	public static void addition(int num1,float num2){
		System.out.println("******Addition with paramter int float*****");
		double res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
	public static void addition(int num1,int num2){
		System.out.println("******Addition with paramter int int****");
		int res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
}
