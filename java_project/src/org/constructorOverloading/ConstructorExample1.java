package org.constructorOverloading;

public class ConstructorExample1 {
	public static void main(String[] args){
		System.out.println("Program starts");
		//addition(25,75);     //or 
		ConstructorExample1.addition(25,75);
		
		ConstructorExample1 ref=new ConstructorExample1();
		ref.primeNumber(11);
	}
	public static void addition(int num1,int num2){
		System.out.println("**Addition with int int param****");
		int res=num1+num2;
		System.out.println("Num1="+num1);
		System.out.println("Num2="+num2);
		System.out.println("Result="+res);
	}
	public void primeNumber(int num){
		int ct=0;
		System.out.println("Num is "+num);
		for (int i=1;i<=num;i++){
			if (num%i==0){
				ct++;
			}
		}
		if(ct==2){
			System.out.println("It is a Prime Number");
		}else{
			System.out.println("It is not a prime Number");
		}
	}
}
