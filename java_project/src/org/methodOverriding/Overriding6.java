package org.methodOverriding;

class Parent2{
	//private methods are not overridden ,because private member doesn't participate in inheritance
	private void m1(){
		System.out.println("from parent m1()");
	}
	protected void m2(){
		System.out.println("from Parent m2()");
	}
}
class Child2 extends Parent2{
	//new m1() method no overriding here its a private method ,unique to child class 
	public void m1(){
		System.out.println("from child m1()");
	}
	//@overriding method with more accessibility 
	//@override
	protected void m2(){
		System.out.println("From Child2 m2()");
	}
}
//Driver Class
public class Overriding6{
	public static void main(String[] args){
		Parent2 obj1=new Parent2();
		obj1.m2();
		//obj.m1();    //compile time error as private member can't be access from outside the class
		Parent2 obj2=new Child2();
		obj2.m2();
		Child2 obj3=new Child2();
		obj3.m2();
		obj3.m1();
	}
}
/*
In java we can increase the visibility of members but we can not decrease it
private-->can't override because they won't get inherited to child class and we xcan't change its access modifier while override
default-->default /protected/public
protected-->protected/public
public-->public

Private member of parent class can't br overriden
*/
