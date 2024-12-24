package org.abstraction;

interface Animal12{
	int age=20;   //by default public static final
	public void animalSound();  //interface method does not have body
	public void sleep(int i);  //interface method does not have body
}
//interface
interface Reptile{
	public void color();
}
//Pig12 implements the Abimal12 interface
class Pig12 implements Animal12{
	public void animalSound(){
		System.out.println("The pig says:wee wee");
	}
	public void sleep(int k){
		System.out.println("zZZ");
	}
}
class Dog12 extends Pig12 implements Reptile{
	public void animalSound(){
		System.out.println("The Dog Says : Bow Bow");
	}
	public void color(){
		System.out.println("Color : Blue");
	}
}
public class Interface7{
	public static void main(String[] args){
		Pig12 obj=new Pig12();
		obj.animalSound();
		obj.sleep(25);
		Dog12 obj1=new Dog12();
		obj1.animalSound();
		obj1.color();
		obj.sleep(10);
	}
}
