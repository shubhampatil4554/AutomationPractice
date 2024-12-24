package org.finalKeyword;

public class Example2 {
	/*
	final static int age;         //compile time error
	final double salary;          //compile time error
	*/
	final static int age=25;
	final double salary=35000.356;
	public static void main(String[] args){
		System.out.println("Program starts");
		System.out.println("age="+age);
		//age=30;                 //compile time error
		Example2 ref=new Example2();
		System.out.println("Salary = "+ref.salary);
		//ref.salary=5000.25;     //compile time error
		System.out.println("Program Ends");
	}
}
/*
final local variable-
                we can declare a variable as final and can be initialize later before use
final global variable-
                we can declare global variable with final keyword,but it should be initialize at same time
				but:
				    -static final global variable ,can be initialized later if you are using static block
					-non-static final global variable ,can be initialized later only using either non-static
*/