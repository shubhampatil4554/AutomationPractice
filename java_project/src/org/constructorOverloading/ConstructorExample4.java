package org.constructorOverloading;

public class ConstructorExample4 {
	int age;
	double salary;
	ConstructorExample4(int a,double b){
		System.out.println("***I am with int double param constructor***");
		age=a;
		salary=b;
	}
	public static void main(String[] args){
		System.out.println("Program starts");
		ConstructorExample4 ref1=new ConstructorExample4();
		System.out.println("Global variable with age ref1: "+ref1.age);      //0
		System.out.println("Global variable with salary ref1: "+ref1.salary);//0.0
		
		ConstructorExample4 ref2=new ConstructorExample4(30);
		System.out.println("Global variable with age ref2: "+ref2.age);      //30
		System.out.println("Global variable with salary ref2: "+ref2.salary);//0.0
		
		ConstructorExample4 ref3=new ConstructorExample4(45,85000);
		System.out.println("Global variable with age ref3: "+ref3.age);      //45
		System.out.println("Global variable with salary ref3: "+ref3.salary);//85000.0
		
		System.out.println("Program Ends");
	}
	ConstructorExample4(){
		System.out.println("***I am zero param constructor***");
	}
	ConstructorExample4(int a){
		System.out.println("***I am int param constructor***");
		age=a;
	}
}
/*
Constructor Overloading :
   when a class contains more than one constructor then that will be known as constructor overloading
   with this we can intialize each object with different values based on the need 
   Rules:
        number of param different
		type of param different
		position of param different
*/

