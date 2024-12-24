package org.abstraction;

//Abstract Class
abstract class Animal{
	//Abstract method (does not have body)
	public abstract void animalSound();
	//Regular Method
	public void sleep(){
		System.out.println("ZZZ");
	}
}
//Subclass (inherit from animal)
class Pig extends Animal{
	public void animalSound(){
		//The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}
//Subclass (inherit from Animal)
class Dog8 extends Animal{
	public void animalSound(){
		//The body of animalSound() provided here
		System.out.println("The dogs says: bow bow");
	}
}
public class AbstractClass{
	public static void main(String[] args){
		Pig myPig=new Pig();
		myPig.animalSound();
		myPig.sleep();
		Dog8 d1=new Dog8();
		d1.animalSound();
		d1.sleep();
	}
}
