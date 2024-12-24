package org.methodOverriding;

class Parent3{
	//final can't be overridden
	final void show(){
		System.out.println("I am final method of parents class");
	}
}
class Child3 extends Parent3{
	//This would produce error
/*  void show(){
		System.out.println("I am show method of child3 class");
	}      */
}
//Driver class
public class Overriding7{
	public static void main(String[] args){
		
	}
}
