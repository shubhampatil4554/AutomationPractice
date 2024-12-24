package org.abstraction;

interface Animal0{
	int age=20;   //by default public static final int age=20;
	public void animalSound();    //interface method(does not have a body)
	public void sleep();         //interface method(does not have a body)
}
//pig implements the animal interface
class Pig7 implements Animal0{
	public void animalSound(){
		//The body of animalSound() provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep(){
		//The body of sleep() provided here
		System.out.println("ZZZ");
	}
}
public class Interface6{
	public static void main(String[] args){
		Pig7 obj=new Pig7();
		obj.animalSound();
		obj.sleep();
		Animal0 obj1=new Pig7();
		obj1.animalSound();
		obj1.sleep();
		System.out.println(Animal0.age);
		//Animal0.age=50; can't update its final variable
	}
}
