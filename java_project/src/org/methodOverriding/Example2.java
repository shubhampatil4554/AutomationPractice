package org.methodOverriding;

class Demo1{
	int num=10;
	void calling(){
		System.out.println("I am calling from Demo1");
	}
}
public class Example2 extends Demo1{
	//@override
	void calling(){
		System.out.println("Override in Example2,I am calling from Example2");
	}
	void display(){
		System.out.println("Hello,I am displaying data of Example2");
	}
	public static void main(String[] args){
		System.out.println("Program Starts");
		Example2 e1=new Example2();
		e1.calling();              //overrided body
		e1.display();
		Demo1 d1=new Example2();
		d1.calling();              //Overrided body
		System.out.println("Program Ends");
	}
}
/*
Overriding:-
      -when you try to declare a method in child class which is already present in parent class then that method will be known as Overreded
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
