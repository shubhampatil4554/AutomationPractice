package org.thisKeyAndThisStatement;

public class Example1 {
	static int age;
	public static void main(String[] args){
		System.out.println("Program Starts");
		System.out.println("Static Global Variable age :"+age);                 //0
		int age=25;
		System.out.println("Local variable age:"+age);                          //25
		System.out.println("Static Global Variable age :"+Example1.age);        //0
		Example1.age=age;  //assigning local variable value to global variable
		System.out.println("Updated Static Global Variable age :"+Example1.age);//25
		System.out.println("Program ends");
	}
}
/*
-if a method contains a local variable whose name is same as global variable,
 then in that method body you print variable it will always give a preference to local variable.
-if you want to differentiate them then use standard way to access global variable.
*/
