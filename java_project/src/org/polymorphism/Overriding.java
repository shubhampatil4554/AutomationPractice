package org.polymorphism;

//parent class
class Vehicle{
	//defining method
	void run(){
		System.out.println("Vehicle is moving");
	}
}
//Child class
class Car2{
	//defining same method as in the parent class
	void run(){
		System.out.println("car is running safely");
	}
}
public class Overriding{
	public static void main(String[] args){
		System.out.println("Program Starts");
		Car2 obj=new Car2();    //Creating object
		obj.run();
		System.out.println("Program Ends");
	}
}