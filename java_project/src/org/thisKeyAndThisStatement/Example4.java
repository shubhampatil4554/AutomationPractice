package org.thisKeyAndThisStatement;

public class Example4 {
	int age;
	public static void main(String[] args){
		System.out.println("Program starts");
		Example4 ref=new Example4();
		ref.printValues(30);
		System.out.println("Example4 class object referemce value is: "+ref);                        //Example4@5b2133b1
		System.out.println("Program ends");
	}
	void printValues(int age){
		System.out.println("I am a printValues method of Example4 class and global value is: "+age); //30
		Example4 e1=new Example4();
		System.out.println("Global variable age is : "+e1.age);                                      //0
		//or
		System.out.println("Global variable age is : "+this.age);                                    //0
		System.out.println("this keyword value is :"+this);                                          //Example4@5b2133b1
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
