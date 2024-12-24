package org.singleLevelInheritance;

//Parent Class
class Fruit{
	Fruit(){
		System.out.println("Fruit class constructor");
	}
	public void taste(){
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class Apple extends Fruit{
	Apple(){
		//super();//java compiler will write default super
		System.out.println("Apple class Constructor");
	}
	public void shape(){
		System.out.println("Apple is round");
	}
}
public class Inheritance2{
	public static void main(String[] args){
		Apple fr=new Apple();    //Object of child child
		fr.taste();    //call method of parent class
		fr.shape();    //call method of child class
	}
}
