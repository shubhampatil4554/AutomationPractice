package org.constructorOverloading;

public class ConstructorExample2 {
	int age;
	public static void main(String[] args){
		System.out.println("Program starts");
		ConstructorExample2 ref=new ConstructorExample2();
		System.out.println("Global variable age: "+ref.age);   //25
		System.out.println("Program Ends");
	}
	ConstructorExample2(){
		System.out.println("****I an with zero param constructor****");
		age=25;
	}
}
