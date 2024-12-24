package org.superKeyword;

class Animal6{
	String color="White or Red";
}
class Dog6 extends Animal6{
	String color="Black";
	void printColor(){
		System.out.println("Dog color is: "+color);  //prints color of Dog class
		/*
		Animal6 ref=new Animal6();
		System.out.println("Animal color is :"+ref.color);//print color of animal6
		or
		*/
		System.out.println("Animal color is: "+super.color);//print color of animal6 class
	}
}
public class SuperKeyWord1{
	public static void main(String[] args){
		Dog6 d=new Dog6();
		d.printColor();
	}
}
/*
Super keyword:-
      is an instance of immediate parent class which will help us to 
	  access non-static member from child class when they have common name
*/
