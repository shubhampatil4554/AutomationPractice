package org.herarchicalInheritance;

//Parent class
class Vehicle{
	public void wheels(){
		System.out.println("I have a wheels");
	}
}
//First child class of vehicle class
class Bike extends Vehicle{
	public void countWLB(){
		System.out.println("I am a Bike and has 2 Wheels");
	}
}
//2nd chlid class of vehicle class
class Car extends Vehicle{
	public void countWLC(){
		System.out.println("I am a car and has 4 wheels");
	}
}
//3rd child class of vehicle class
class Scooter extends Vehicle{
	public void countWLS(){
		System.out.println("I am a Scooter and has 2 wheels");
	}
}
public class Inheritance4{
	public static void main(String[] args){
		Bike b1=new Bike();
		b1.wheels();
		b1.countWLB();
		Car c1=new Car();
		c1.wheels();
		c1.countWLC();
		Scooter s1=new Scooter();
		s1.wheels();
		s1.countWLS();
	}
}
