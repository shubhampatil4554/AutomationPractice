package org.constructorOverloading;

public class ConstructorExample5 {
	int age;
	double salary;
	ConstructorExample5(int a,double b){
		System.out.println("**I am int double param constructor**");
		age=a;
		salary=b;
	}
	public static void main(String[] args){
		System.out.println("Program starts");
		
		ConstructorExample5 ref1= new ConstructorExample5();
		System.out.println("Global variable age with ref1 : "+ref1.age);     //0
		System.out.println("Global variable salary with ref1: "+ref1.salary);//0.0
		ref1.age=25;
		System.out.println("Global variable age with ref1: "+ref1.age);      //25
		
		ConstructorExample5 ref2= new ConstructorExample5(30);
		System.out.println("Global variable age with ref2: "+ref2.age);      //30
		System.out.println("Global variable salary with ref2: "+ref2.salary);//0.0
		
		ConstructorExample5 ref3=new ConstructorExample5(45,85000);
		System.out.println("Global variable age with ref3: "+ref3.age);      //45
		System.out.println("Global variable salary with ref3: "+ref3.salary);//85000.0
		System.out.println("Program Ends");
	}
	ConstructorExample5(){
		System.out.println("**I am zero param Constructor**");
	}
	ConstructorExample5(int a){
		System.out.println("**I am int param constructor**");
		age=a;
	}
}
/*
Constructor Overloading :
   -when a class contains more than one constructor then that will be known as constructor overloading
   -with this we can intialize each object with different values based on the need 
   -Rules:
        number of param different
		type of param different
		position of param different
*/

