package org.abstraction;

abstract class Sample1{      //0%
	/*
	variable
	constructor
	method
	      1.Normal method/non-abstract method
		  2.Abstract method-declare with abstract keyword without body
	*/
	void calling(){
		System.out.println("Hi");
	}
}
abstract class Sample2{    //100%
	abstract void dialing();
}
abstract class Sample3{
	void calling(){
		System.out.println("Hi");
	}
	abstract void display();
}
public class Example1 extends Sample3{
	void display(){
	
	}
	public static void main(String[] args){
		
	}
}
