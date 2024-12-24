package org.thisKeyAndThisStatement;

public class ConstructorExample7 {
	ConstructorExample7(int a,double b){
		System.out.println("**I am with int double param constructor**");
	}
	ConstructorExample7(){
		this(11,25830.25);
		System.out.println("**I am with zero param constructor**");
	}
	ConstructorExample7(int a){
		this();
		System.out.println("**I am with int param constructor**");
	}
	public static void main(String[] args){
		System.out.println("Program starts");
		ConstructorExample7 ref = new ConstructorExample7(25);
		System.out.println("Program Ends");
	}
}
/*
int double
zero
int
*/
/*
this()  
      -this statement is also known as current class instance
	  -it will help us to call another constructor of current call based on the parameter from a constructor
	  -it should be used only inside the constructor
	  -it should be the first statement inside the constructor
*/

