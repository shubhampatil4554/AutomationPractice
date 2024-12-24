package org.typeCasting;

class Parent{
	void calling(){
		System.out.println("I am from calling from Parent Class");
	}
}
class Child extends Parent{
	void drawing(){
		System.out.println("I am from drawing from Child Class");
	}
}
public class Example4{
	public static void main(String[] args){
		System.out.println("Program Starts");
		//Parent class Object
		Parent p1=new Parent();
		p1.calling();
		
		//Child class object
		Child c1=new Child();
		c1.drawing();
		c1.calling();
		
		//Upcasting:-parent class reference child class object 
		Parent p2=new Child();   //Implict Upcasting/auto
		p2.calling();
		//p2.drawing();          //compile time error-As parent is not allowed to accsss child properties
		//or
		//Parent p3=(Parent) new Child();  //Explicit upcasting
		//p3.calling();
		//Child c2=new Parent(); //Downcasting is not poassible directly,
		//***Only upcasted object can be downcasted
		
		//Downcasting:-Child class reference=(Typecasting)parent class reference
        Child c3=(Child)p2;      //Downcasting Explicit
        c3.calling();
        c3.drawing();
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
