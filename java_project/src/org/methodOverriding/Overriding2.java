package org.methodOverriding;

class Animal2{
	public void move(){
		System.out.println("Animals can move");
	}
	void display(){
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2{
	//@override
	public void move(){
		System.out.println("Dogs can walk and run");
		display();
	//	Animal2 a1=new Animal2();   //Instance of animal2 class
	//	a1.move();  //or
		super.move();   //Animal2 move() call
	}
}
public class Overriding2{
	public static void main(String[] args){
		Animal2 b=new Dog2();     //Animal2 reference but Dog Object
		b.move();      //overrided call
	}
}
/*
private == method can't overrided , because they are visible/accessible within class body
default == while overriding we can use either default or protected or public
protected == while overriding we can use either protected or public
public == while overriding we can use public 
*/
