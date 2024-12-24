package org.objectClass;

class Demo2{
	void calling(){
		System.out.println("I am calling from Demo2 method");
	}
	//override
	public String toString(){
		return "Pune";
	}
	//override
	public int hashCode(){
		return 101;
	}
	//override
	public boolean equals(Object obj){
		return true;
	}
}
public class ObjectClassExample3 extends Demo2{
	int age=25;
	public static void main(String[] args){
		System.out.println("Program starts");
		Demo2 d1=new Demo2();
		System.out.println("Demo2 obj d1:"+d1.toString());
		System.out.println("Demo2 obj d1 address in number: "+d1.hashCode());
		Demo2 d2=new Demo2();
		System.out.println("Demo2 obj d2:"+d2);//toString() method called internally by java compiler 
		System.out.println("Demo2 obj d2 address in number: "+d2.hashCode());
		System.out.println("comparing d1 and d2 object of demo2 class based on adress:"+d1.equals(d2));
		Demo2 d3=d2;
		System.out.println("Demo2 obj d3:"+d3);//toString() method called internally by java compiler 
		System.out.println("Demo2 obj d3 address in number:"+d3.hashCode());
		System.out.println("comparing d1 and d3 object of demo2 class based on address:"+d1.equals(d3));
		ObjectClassExample3 obj1 = new ObjectClassExample3();
		System.out.println("ObjectClassExample3 obj obj1:"+obj1.toString());
		System.out.println("ObjectClassExample3 obj obj1 address in number:"+obj1.hashCode());
		ObjectClassExample3 obj2 = new ObjectClassExample3();
		System.out.println("ObjectClassExample3 obj obj2:"+obj2.toString());
		System.out.println("ObjectClassExample3 obj obj2 address in number:"+obj2.hashCode());
		System.out.println("comparing obj1 and obj2 using equals():"+obj1.equals(obj2));
		System.out.println("Program Ends");
	}
}
/*
toString():-this will help you to get string representation of Object in the form of FullyQualifiedClassname@hexadecimaladdress
hashCode():-this will help you to convert hexadecimaladdress into integer
equals():-this will help you to compare two objects based on there address and returns true if both are same else return false

As methods are public ,we can override them
*/
