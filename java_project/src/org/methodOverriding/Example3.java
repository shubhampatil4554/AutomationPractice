package org.methodOverriding;

class Demo3{
	int num=10;
	void calling(){
		System.out.println("I am calling from demo3");
	}
}
public class Example3 extends Demo3{
	int num =25;
	//@override
	void calling(){
		System.out.println("Override I am Example3,I am calling from Example3");
	}
	void display(){
		System.out.println("Hello, I am displaying data of Example3");
		System.out.println("num from example3:"+num);
	/*  Demo3 d1=new Demo3();
		d1.calling();
		System.out.println("num from demo3:"+d1.num);  */
		//or
		super.calling();
		System.out.println("num from Demo3 using super keyword: "+super.num);
	}
	public static void main(String[] args){
		System.out.println("Program starts");
		Example3 e1=new Example3();
		e1.display();
		System.out.println("Program Ends");
	}
}
/*
Super:-
      -its known as parent class
	  -used to access parent class non-static members from child class non-static method or constructor
	  *-Mainly used when parent and child class are having common name for variable and methods 
Overriding:-
      -when you try to declare a method in child class which is already present in parent class then that method willl be known as Overreded
	  -when overriding inheritance is mandatory
	         -you can change method body
			 -you can increase method visibility
			          default------->default|protected|public
					  protected----->protected|public
					  public-------->public
	 -while overriding following things are not possible
	         -parameter
			 -return type
			 -private method
			 -constructor
			 -variable
			 -final method
*/
