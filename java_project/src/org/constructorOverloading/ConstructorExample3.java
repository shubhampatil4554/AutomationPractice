package org.constructorOverloading;

public class ConstructorExample3 {
	int age;
	public static void main(String[] args){
		System.out.println("Program starts");
		ConstructorExample3 ref=new ConstructorExample3(25);
		System.out.println("Global variable age with ref:"+ref.age);    //25
		
		ConstructorExample3 ref2=new ConstructorExample3(30);
		System.out.println("Global variable age with obj:"+ref2.age);   //30
		System.out.println("program Ends");
	}
	ConstructorExample3(int a){
		System.out.println("***I am with int param constructor***");
		age=a;
	}
}
