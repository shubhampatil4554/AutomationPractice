package org.abstraction;

abstract class Bike1{
	abstract void run();
	void speed(int spd){
		System.out.println("Bike speed:"+spd);
	}
}
class Honda4 extends Bike1{
	//override
	void run(){
		System.out.println("Running safely");
	}
	void color(){
		System.out.println("Honda1 color is blue");
	}
}
class AbstractClass1{
	public static void main(String[] args){
		Honda4 obj=new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();
		//Bike1 b1=new Bike1();     //We can't create object of abstract class as it is incomplete object
		Bike1 b2=new Honda4();
		b2.run();
		b2.speed(20);
		//b2.color();  // not accessible ref of Bike1(Parent) and object of honda4(child)
	}
}
/*
 Classname ref=new Classname();
*/
