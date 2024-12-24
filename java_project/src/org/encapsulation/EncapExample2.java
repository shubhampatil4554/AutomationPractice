package org.encapsulation;

class Demo2{
	private int num1=20;
	public static void main(String[] args){
		System.out.println("I am main of Demo2");
		Demo2 ref=new Demo2();
		System.out.println("private num1:-"+ref.num1);
	}
	//return num1
	public int getNum1(){
		return num1;
	}
}
public class EncapExample2{
	public static void main(String[] args){
		System.out.println("Hello, I am from EncapExample2 class");
		Demo2 ref=new Demo2();
		//System.out.println(""private num1:-"+ref.num1);  //can't access as its declared as private
		System.out.println("private num1 using ref and getter :-"+ref.getNum1());
	}
}
