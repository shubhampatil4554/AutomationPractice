package org.methodOverriding;

class Animal1{
	Animal1(){
		
	}
	public void move(){
		System.out.println("Animals can move");
	}
}
class Dog extends Animal1{
	Dog(){
		super();
	}
	//@override
	public void move(){
		System.out.println("Dogs can walk and run");
	}
	public void bark(){
		System.out.println("Dogs can bark");
	}
}
public class Overriding1{
	public static void main(String[] args){
		Animal1 a=new Animal1();  //Animal1 reference and Animal1 object
		a.move();           //Animals can move
		Dog d1=new Dog();    //Dog reference and Dog Object
		d1.move();        // Dogs can walk and run
		d1.bark();        //Dogs can bark
		System.out.println("**************");
		Animal1 a1=new Dog();  //Animal1 reference and Dog Object //overrided method can load
		a1.move();        //Dogs can walk and run//overrided call
		//variable a1 of type Animal1
		//a1.bark();   //a1 complile time error since b's reference type Animal1 does'nt
	}
}
/*

when we declare a method in child class which is already present in parent class then that method will be known as overrided method

Overriding:-
      -when you try to declare a method in child class which is already present in parent class then that method willl be known as Overreded
	  -when overriding inheritance is mandatory
	         -you can change method body
			 -you can increase method visibility
			          default------->default|protected|public
					  protected----->protected|public
					  public-------->public
	 -while overriding following things are not possible
	         -parameter
			 -return type
			 -private method
			 -constructor
			 -variable
			 -final method
*/
