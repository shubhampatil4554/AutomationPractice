package org.multiLevelInheritance;

class Grandfather{
	Grandfather(){
		System.out.println("I am GrandFather class constructor");
	}
	void myHome(){
		System.out.println("Grandfather Home");
	}
}
class Father extends Grandfather{
	Father(int i){
		super();    //by compiler
		System.out.println("I am father class constructor");
	}
	void myCar(){
		System.out.println("Father Car");
	}
}
class Child extends Father{
	Child(){
		super(25);  //by compiler
		System.out.println("I am child class Constructor");
	}
	void myBike(){
		System.out.println("Child Bike");
	}
}
public class Example3{
	public static void main(String[] args){
		System.out.println("Program Starts");
		Child ref=new Child();
		ref.myHome();
		ref.myCar();
		ref.myBike();
		
		Father ref2=new Father(25);
		ref2.myCar();
		ref2.myHome();
		System.out.println("Program Ends");
	}
}
