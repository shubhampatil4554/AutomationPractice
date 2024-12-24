package org.multipleInheritance;

class B2{
	void msg(){
		System.out.println("Welcome");
	}
}
class A2{
	void msg(){
		System.out.println("Hello");
	}
}
/*class Inheritance5 extends A2,B2{
	Inheritance5(){
		super();                    //confusion
	}
	public static void main(String[] args){
		Inheritance5 obj=new Inheritance5();
		obj.msg();
	}
}

is java support multiple inheritance or not?
--> No
Why java doesn't support multiple inheritance using classes?
--> super(); get confuse
*/
