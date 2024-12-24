package org.encapsulation;

class Demo3{
	private int num1=20;
	public static void main(String[] args){
		System.out.println("I am from Demo3 class");
		Demo3 ref=new Demo3();
		System.out.println("private num1:-"+ref.num1);
	}
	//param num1 the num1 to set
	public void setNum1(int num1){
		this.num1=num1;
	}
}
public class EncapExample3{
	public static void main(String[] args){
		System.out.println("Hello,I am from EncapExample3 class");
		Demo3 ref=new Demo3();
		//System.out.println("private num1:-"+ref.num1);   //can't access as its declared as private
		ref.setNum1(25);
	}
}
