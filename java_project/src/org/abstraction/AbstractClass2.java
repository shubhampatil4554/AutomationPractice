package org.abstraction;

abstract class Shape{
	abstract void draw();
}
//in real scenario,implementation is provided here by others i.e.unknown by end user
class Rectangle extends Shape{
	//override
	protected void draw(){
		System.out.println("Drawing rectangel");
	}
}
class Circle1 extends Shape{
	//Override
	public void draw(){
		System.out.println("Drawing Circle1");
	}
}
class AbstractClass2{
	public static void main(String[] args){
		Shape s=new Circle1();
		s.draw();            //Drawing Circle1
		Shape s1=new Rectangle();
		s1.draw();            //Drawing rectanglel
	}
}
