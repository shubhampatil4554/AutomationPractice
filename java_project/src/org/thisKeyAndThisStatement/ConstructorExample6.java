package org.thisKeyAndThisStatement;

public class ConstructorExample6 {
	ConstructorExample6(int a,double b){
		System.out.println("**I am int double param constructor**");
	}
	ConstructorExample6(){                            
		this(25);                                     //call line no.9
		System.out.println("**i am zero param constructor**");
	}
	ConstructorExample6(int a){
		this(20,25000.66);                            //call line no.2
		System.out.println("**I am int param constructor**");
	}
	public static void main(String[] args){
		System.out.println("Program Starts ");
		ConstructorExample6 ref=new ConstructorExample6();
		System.out.println("Program ends");
	}
}
/*
int,double 
int
zero 
*/
/*
this()  
      -this statement is also known as current class instance
	  -it will help us to call another constructor of current call based on the parameter from a constructor
	  -it should be used only inside the constructor
	  -it should be the first statement inside the constructor
*/

