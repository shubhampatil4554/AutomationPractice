package org.abstraction;

interface i1{
	//variable--->by default--->public static final
	//method--->by default--->public abstract
	//no complete method/non-abstract
	//no constructor
}
//Interface Declaration : by first user
interface Drawable{
	int salary =25000;    //by default -->public static final int salary=25000;
	void draw();          //by default -->public abstract void draw();
}
//Implementation : by second user
class Rectangle1 implements Drawable{
	public void draw(){
		System.out.println("Drawing rectangle");
	}
}
//Implementation : by third user
class Circle2 implements Drawable{
	public void draw(){
		System.out.println("Drawing Circle");
	}
}
//Driver class
public class Interface1{
	public static void main(String[] args){
		System.out.println("Interface variable salary: "+Drawable.salary);
		Rectangle1 r1=new Rectangle1();
		r1.draw();         //Drawing rectangle
		Circle2  c1=new Circle2();
		c1.draw();         //Drawing Circle
		//Drawable d1=new Drawable();   //can't create an instance of interface
		//Circle class object is created and referred by interface Drawable
		Drawable d=new Circle2();
		d.draw();         //Drawing Circle
		Drawable d2=new Rectangle1();
		d2.draw();        //Drawing rectangle
	}
}
/*
** Interface:- used to achieve abstraction in java 
             -As we know java doesn't support multiple inheritance using classes to overcome this java provides interface to support this
			 -its 100% abstract,no non-abstract method
			 -inside interface will have -no constructor
			                             -variable-->by default-->public static final
										 -methods-->by default-->public abstract
			 -whenever a subclass inherits the interface they use implements keyword
			 -Ex.  class ChildClass implements Interfacename{
				 
			 }
			 -As we are not allowed to create an instance of abstract class similarly we are not allowed to create instance 
			          of interface (because its also incomplete)
			 -When a interface is getting inherited by subclass ,then there will a contract between these classes that subclasses that 
			           subclasses needs to override all abstract method of interface otherwise subclasses becomes abstract class
			 -Between:-
			          1.two classes we use 'extends'
					  2.two interface we use 'extends'
					  3.class and interface use 'implements'
*/
