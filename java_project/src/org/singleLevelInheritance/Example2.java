package org.singleLevelInheritance;

class Demo1{
	int num=10;
	void calling(){
		System.out.println("I am calling from demo1");
	}
}
public class Example2 extends Demo1{
	void display(){
		System.out.println("I sm displaying Data of Example1");
	}
	public static void main(String[] args){
		System.out.println("Program Starts");
		Example2 e1=new Example2();
		System.out.println("num from demo1 class using object reference of Example1:"+e1.num);
		e1.calling();
		e1.display();
		System.out.println("*************");
		Demo1 d1=new Example2();  //Demo1 non-ststic member load
		System.out.println("num from demo1 class using object of Example and reference of Example1:"+d1.num);
		d1.calling();
		//d1.display();  //error
		System.out.println("Program Ends");
	}
}
