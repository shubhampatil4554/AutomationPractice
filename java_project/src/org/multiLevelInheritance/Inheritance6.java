package org.multiLevelInheritance;

//super class/Parent class/Base Class
class Grandfather2{
	Grandfather2(){
		System.out.println("I am a class Grandfather2 constructor");
	}
	void myHome(){
		System.out.println("I am home of grandfather");
	}
}
//subclass/childClass/derived class
class Father2 extends Grandfather2{
	Father2(double d){
		super();  //if we don't write this ,java compiler will write by default super();
		System.out.println("I am class Father2 Constructor");
	}
	void myCar(){
		System.out.println("I am a car of Father2");
	}
}
class Child2 extends Father2{
	Child2(int i){
		super(12.34);
		System.out.println("I am class Child2 Constructor");
	}
	void myBike(){
		System.out.println("I am bike of child");
	}
}
public class Inheritance6{
	public static void main(String[] args){
		System.out.println("***********1***********");
		//Create an object of Child2 class
		Child2 c1=new Child2(21);
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("***********2***********");
		//create an object or instance of child most class and referred by its parent
		Father2 f1=new Father2(254.1);
		f1.myCar();
		f1.myHome();
		//f1.myBike();    //Error its a proprty of child2
		System.out.println("***********3***********");
		Father2 f2=new Child2(25);  //Father non-static member loaded =myHome,myCar
		f2.myCar();
		f2.myHome();
		//f2.myBike();    //error its a property of Child2 
		System.out.println("***********4***********");
		//Father non-static member loaded =myHome,myCar
		Father2 f3=c1;   //Father2 f1=c1=new Child2(21);home,car but bike will not be visible/accessible to father
		f3.myHome();
		f3.myCar();
		//f1.myBike();     //error as its a property of child2
		System.out.println("***********5***********");
		Grandfather2 g1=c1;   //Grandfather2 g1=c1=new Child2(21); home but car and Bike will not be visible/accessible to grandfather
		g1.myHome();
		//Error its property of father and child
		//g1.myCar();
		//g1.myBike();
		System.out.println("***********6***********");
	}
}
/*
Add debug poin in the required line
-f6-next line or you want to execute current line and move next line
-f5-if you want to go inside the called method or function
-f8-continue ,to continue the normal execution flow
-ctr+shift+f-to check the variable value or method return value
Statemnts are two type
  1.Homogenous: LHS=RHS
	 2.Heterogenous: LHS!=RHS
	 int age=20;  //Homogenous
	 double salary =25000;   //Heterogenous
	 A a1=new A();
	 A a2=new B();
	 A a3= a1;
	 B b1=new B();
	 A a4=b1;
*/
