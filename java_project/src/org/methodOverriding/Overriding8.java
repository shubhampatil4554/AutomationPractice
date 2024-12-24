package org.methodOverriding;

class Parent4{
	//static method in base class which will be hidden in subclass
	static void m1(){
		System.out.println("from parent "+" static m1()");
	}
	//non-static method which will be overridden in derived class
	void m2(){
		System.out.println("From parent "+ "from non-static (instance) m2()");
	}
}
class Child4 extends Parent4{
	//This method hides m1() in parent
    static void m1(){
			System.out.println("From Child Static m1()");
	}
	//This method overrides m2() in parent
	//@override
	public void m2(){
		System.out.println("from Child"+" Non-static (instance) m2()");
	}
}
//Driver Class
public class Overriding8{
	public static void main(String[] args){
		Parent4 obj1=new Child4();
		obj1.m1();     //java Compiler will covert it into --->Parent4.m1();
		//Here overriding works and child's m2() is called
		obj1.m2();
	}
}