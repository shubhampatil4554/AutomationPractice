package org.multiLevelInheritance;

class Sample10{
	//default constructor
	int age=10;
	static int empId=101;
}
class Sample20 extends Sample10{
	//default constructor with default super()
	double salary=45000.45;
	static boolean status=true;
}
public class Example2 extends Sample20{
	//default constructor with default super()
	char grade='A';
	static int pin=3245;
	public static void main(String[] args){
		System.out.println("Program Starts");
		Example2 ref=new Example2();        //age=10  | salary=45000.45 |  grade='A'
		System.out.println("age from Sample10 using Example2 ref:"+ref.age);
		System.out.println("salary from Sample20 using Example2 ref:"+ref.salary);
		System.out.println("grade from Example2 using Example2 ref:"+ref.grade);
		System.out.println(pin);
		System.out.println(status);
		System.out.println(empId);
		System.out.println("Program Ends");
	}
}
/*
Rule:-
     -child class inherits only non-static member of parent class
	 this is represented using extends keyword
	 this uses super() to inherits parent class members
Super():- is use to parent class constructor from child class based on the parameter 
          it should be the first statement inside the constructor body
		  this() and super() can't be use together
*/
