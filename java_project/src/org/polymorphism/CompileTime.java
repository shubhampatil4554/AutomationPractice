package org.polymorphism;

public class CompileTime{
	static void sum(int a,int b){
		int sum=a+b;
		System.out.println("Addition Of two numbers:"+sum);
	}
	static void sum(int a,int b,int c){
		int sum=a+b+c;
		System.out.println("Addition Of three numbers:"+sum);
	}
	public static void main(String[] args){
		CompileTime.sum(45,80,22);
	}
}
/*
Compile time Polymorphism/static polymorphism/static binding/compile time binding/early binding
When method gets to know its implementation at the time of compilation is known as compile time polymorphism
this can be achieved by using static method overloading
*/