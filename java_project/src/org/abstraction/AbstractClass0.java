package org.abstraction;

abstract class Demo100{       //50% abstract
	abstract void print();     //abstract method/incomplete method/incomplete method
	void display(){            //normal or non-abstract method or complete method
		System.out.println("I am non-abstract method display()");
	}
}
abstract class Demo101{         //0% abstract
	void display(){
		System.out.println("I am non-abstract method display()");
	}
	void display2(){
		System.out.println("I am non-abstract method display2()");
	}
}
abstract class Demo102{         //100% abstract
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class AbstractClass0{
	public static void main(String[] args){
		
	}
}
/*
Class declared with abstract keyword known as abstract class,0 to 100 % abstract it will have
    -abstract method-->method declared with abstract keyword without body
	-non-abstract method-->normal method/consrete method
	-constructor
	-static method
	-global variable
Abstract class object can't be create as its incomplete class
If any class contains even one abstract method then that class should be declared as abstract class
When an abstract class is getting inherited by a subclass,then there will be a contract between these class 
     that subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes abstract class
*/
