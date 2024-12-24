package org.methodOverLoading;

public class Example3 {
	public static void main(String[] args){
		Example3 ref=new Example3();
		ref.addition();              //call line no.11
		ref.addition(25.36f,10);     //call line no.18
		ref.addition(30,45.28f);     //call line no.25
		ref.addition(85,15);         //call line no.32
	}
	public void addition(){
		System.out.println("******Addition without paramter*****");
		int num1=25,num2=50,res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
	public void addition(float num1,int num2){
		System.out.println("******Addition with paramter float int*****");
		double res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
	public void addition(int num1,float num2){
		System.out.println("******Addition with paramter int float*****");
		double res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
	public void addition(int num1,int num2){
		System.out.println("******Addition with paramter int int****");
		int res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("result="+res);
	}
}
