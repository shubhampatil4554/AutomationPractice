package org.typeCasting;

class Parent1{
	void calling(){
		System.out.println("I am from calling of Parent1 class");
	}
}
class Child1 extends Parent1{
	void drawing(){
		System.out.println("I am from drawing of Child1 class");
	}
}
public class Example5{
	public static void main(String[] args){
		System.out.println("Program Starts");
		Parent1 p1= new Parent1();
		p1.calling();
		
		Child1 c1=new Child1();
		c1.calling();
		c1.drawing();
		
		Parent1 p2=new Child1();   //Upcasting Implicitly
		p2.calling();
		//Only Upcasted can be downcasted
		Child1 c2=(Child1)p2;      //Downcasting explicit
		c2.calling();
		c2.drawing();
		System.out.println("Program Ends");
	}
}
/*
non-primitive/derived casting:
	converting one class into another class is known as non-primitive casting
	for this inheritance is mandatory
		converting child class object into parent class known as up-casting
		converting parent class object into child class is known as down-casting

*/
