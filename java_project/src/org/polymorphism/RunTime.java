package org.polymorphism;

class Animal{
	void eat(){
		System.out.println("Animals Eat");
	}
}
class Herbivores extends Animal{
	void eat(){
		System.out.println("Herbivores eat plants");
	}
}
class Omnivores extends Animal{
	void eat(){
		System.out.println("Omnivores eat plants and meat");
	}
}
class Carnivores extends Animal{
	void walking(){
		System.out.println("Carnivores Walking");
	}
} 
public class RunTime{
	public static void main(String[] args){
		Animal a=new Animal();
		a.eat();  //Animals Eat
		Animal h=new Herbivores();   //run time polymorphism-inheritance+upcasting+overriding
		h.eat();  //Herbivores eat plants
		Animal o=new Omnivores();    //run time polymorphism-inheritance+upcasting+overriding
		o.eat();  //Omnivores eat plants and meat
		Animal c=new Carnivores();   //not a run time polymorphism -inheritance+upcasting+no overriding
		c.eat();
	}
}
/*
Run time polymorphism/Dynamic Polymorphism/Dynamic Binding/Run time Binding/Late Bindings
When a methods gets to know its implementation at the time of execution time is known as run-time polymorphism
1.Inheritance
2.Upcasting
3.Method Overriding
*/
