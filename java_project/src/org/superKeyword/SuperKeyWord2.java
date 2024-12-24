package org.superKeyword;

class Animal7{
	void eat(){
		System.out.println("eat() of Animal7 class...");
	}
}
class Dog7 extends Animal7{
	void eat(){
		System.out.println("eat() of Dog7 class..");
	}
	void bark(){
		System.out.println("bark() of Dog7 class..");
	}
	void work(){
		bark();
		eat();
		System.out.println("work() of Dog7 class...");
		System.out.println("***************");
		/*
		Animal7 ref =new animal7();
		ref.eat();
		*/  //or
		super.eat();
	}
}
public class SuperKeyWord2{
	public static void main(String[] args){
		Dog7 d=new Dog7();
		d.work();
	}
}
