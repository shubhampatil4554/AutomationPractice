package org.thisKeyAndThisStatement;

public class Example2 {
	int age;
	public static void main(String[] args){
		System.out.println("Program Starts");
		
		Example2 ref=new Example2();
		ref.printValues();
		ref.printValues(30);
		System.out.println("Program Ends");
	}
	void printValues(){
		System.out.println("I am a printValues method of example2 class and global variable age value is :"+age); //0
	}
	void printValues(int age){
		System.out.println("I am a printValues method of example2 class and global variable age value is :"+age); //30
		Example2 e1=new Example2();
		System.out.println("Global variable age is :"+e1.age);                                                     //0
		System.out.println("Global variable age is :"+this.age);                                                   //0
	}
}
/*
this Kwyword-
          -it is known as current class instance
		  -used inside non-static method or constructor only
		  -used to access non-static members
		  -mainly is differentiate when non-static method local variable name is same as non-static global variable
*/
/*
-if a method contains a local variable whose name is same as global variable,
 then in that method body you print variable it will always give a preference to local variable.
-if you want to differentiate them then use standard way to access global variable.
*/
