package org.methodOverriding;

//Base class or parent Class or Super class
class Parent{
	void show(){
		System.out.println("Parent's show");
	}
}
//inherited class or child class or sub class
class Child extends Parent{
	//This method overrides shows() of parent
	//@Override
	void show(){
		System.out.println("Child's Show");
	}
}
//Driver class
public class Overriding5{
	public static void main(String[] args){
		//If a parent type reference refers to a parent object ,then parent's show() is called
		Parent obj1=new Parent();
		obj1.show();
		//If parent type rference refers to a child object child's show() is called.This is called 
		//Run Time Polymorphism
		Parent obj2=new Child();
		obj2.show();
	}
}
